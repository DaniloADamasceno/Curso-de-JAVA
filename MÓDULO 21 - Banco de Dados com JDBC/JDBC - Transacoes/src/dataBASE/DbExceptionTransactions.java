package dataBASE;

import java.io.Serial;

public class DbExceptionTransactions extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DbExceptionTransactions(String msg) {
        super(msg);
    }
}

