package dataBase;

import java.io.Serial;

public class DbIntegrityException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    private final String msg;

    public DbIntegrityException(String msg)
    {
        super(msg);
        this.msg = msg;
    }
}
