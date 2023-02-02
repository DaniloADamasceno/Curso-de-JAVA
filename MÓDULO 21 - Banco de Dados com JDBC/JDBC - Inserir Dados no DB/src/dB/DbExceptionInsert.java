package dB;

import java.io.Serial;


// Classe para tratamento de exceções personalizadas para o banco de dados
public class DbExceptionInsert extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    //----------------------------------------   Constructors   --------------------------------------------------------
    public DbExceptionInsert(String msg) {
        super(msg);
    }
}
