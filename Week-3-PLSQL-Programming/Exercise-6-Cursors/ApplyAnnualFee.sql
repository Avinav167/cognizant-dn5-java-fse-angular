DECLARE

    CURSOR ApplyAnnualFee IS
        SELECT AccountID
        FROM Accounts;

    v_account Accounts.AccountID%TYPE;

    annual_fee CONSTANT NUMBER := 500;

BEGIN

    OPEN ApplyAnnualFee;

    LOOP

        FETCH ApplyAnnualFee
        INTO v_account;

        EXIT WHEN ApplyAnnualFee%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - annual_fee
        WHERE AccountID = v_account;

    END LOOP;

    CLOSE ApplyAnnualFee;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Annual fee applied successfully.'
    );

END;
/