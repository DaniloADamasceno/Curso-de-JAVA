package dataBASE;

public class DbIntegrityExceptionTransactions extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DbIntegrityExceptionTransactions(String msg) {
        super(msg);
    }
}
