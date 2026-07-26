DECLARE

    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID,
               InterestRate
        FROM Loans;

    v_loan UpdateLoanInterestRates%ROWTYPE;

BEGIN

    OPEN UpdateLoanInterestRates;

    LOOP

        FETCH UpdateLoanInterestRates
        INTO v_loan;

        EXIT WHEN UpdateLoanInterestRates%NOTFOUND;

        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = v_loan.LoanID;

    END LOOP;

    CLOSE UpdateLoanInterestRates;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Loan interest rates updated successfully.'
    );

END;
/