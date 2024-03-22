package dataBase;

import java.io.Serial;

public class DataBaseExceptionDAO extends  RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DataBaseExceptionDAO(String msg)
    {
        super(msg);
    }
}

