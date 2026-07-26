DECLARE

    CURSOR GenerateMonthlyStatements IS
        SELECT TransactionID,
               AccountID,
               TransactionDate,
               Amount,
               TransactionType
        FROM Transactions
        WHERE TO_CHAR(TransactionDate, 'MMYYYY') =
              TO_CHAR(SYSDATE, 'MMYYYY');

    v_transaction GenerateMonthlyStatements%ROWTYPE;

BEGIN

    OPEN GenerateMonthlyStatements;

    LOOP

        FETCH GenerateMonthlyStatements
        INTO v_transaction;

        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(
            'Transaction ID : ' || v_transaction.TransactionID ||
            ' | Account : ' || v_transaction.AccountID ||
            ' | Amount : ' || v_transaction.Amount ||
            ' | Type : ' || v_transaction.TransactionType
        );

    END LOOP;

    CLOSE GenerateMonthlyStatements;

END;
/