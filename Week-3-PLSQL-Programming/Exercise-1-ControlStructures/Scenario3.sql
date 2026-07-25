BEGIN

    FOR loan IN (

        SELECT
            l.LoanID,
            c.Name,
            l.EndDate

        FROM Loans l
        JOIN Customers c
        ON l.CustomerID = c.CustomerID

        WHERE l.EndDate
        BETWEEN SYSDATE
        AND SYSDATE + 30

    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: '
            || loan.Name
            || ' has Loan ID '
            || loan.LoanID
            || ' due on '
            || TO_CHAR(
                    loan.EndDate,
                    'DD-MON-YYYY'
               )
        );

    END LOOP;

END;
/