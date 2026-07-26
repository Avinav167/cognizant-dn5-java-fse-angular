CREATE OR REPLACE TRIGGER LogTransaction

AFTER INSERT
ON Transactions

FOR EACH ROW

BEGIN

    INSERT INTO AuditLog(

        TransactionID,
        ActionPerformed,
        ActionDate

    )

    VALUES(

        :NEW.TransactionID,
        'Transaction Inserted',
        SYSDATE

    );

END;
/