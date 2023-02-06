package dataBASE;

public class DbExceptionTransactions extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DbExceptionTransactions(String msg) {
        super(msg);
    }
}

