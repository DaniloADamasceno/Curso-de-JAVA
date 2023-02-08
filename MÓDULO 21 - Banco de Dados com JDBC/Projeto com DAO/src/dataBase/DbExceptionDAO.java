package dataBase;

import java.io.Serial;

public class DbExceptionDAO  extends  RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DbExceptionDAO(String msg)
    {
        super(msg);
    }
}

