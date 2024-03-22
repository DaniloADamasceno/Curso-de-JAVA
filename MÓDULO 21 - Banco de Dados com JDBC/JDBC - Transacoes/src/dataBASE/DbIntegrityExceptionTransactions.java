package dataBASE;

import java.io.Serial;

public class DbIntegrityExceptionTransactions extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DbIntegrityExceptionTransactions(String msg) {
        super(msg);
    }
}
