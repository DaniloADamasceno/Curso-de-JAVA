package database;


import java.io.Serial;



    public class DbExceptionDelete extends RuntimeException {

        @Serial
        private static final long serialVersionUID = 1L;

        //----------------------------------------   Constructors   --------------------------------------------------------
        public DbExceptionDelete(String msg) {
            super(msg);
        }
    }