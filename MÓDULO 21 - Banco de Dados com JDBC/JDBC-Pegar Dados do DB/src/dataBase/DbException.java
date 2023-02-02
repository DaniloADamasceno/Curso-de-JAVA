package dataBase;

import java.io.Serial;


// Classe para tratamento de exceções personalizadas para o banco de dados
public class DbException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    //----------------------------------------   Constructors   --------------------------------------------------------
    public DbException(String msg) {
        super(msg);
    }
}

