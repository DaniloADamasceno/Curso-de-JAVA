package db;

import java.io.Serial;

public class DbExceptionUpdate extends RuntimeException{



        @Serial
        private static final long serialVersionUID = 1L;

        //----------------------------------------   Constructors   --------------------------------------------------------
        public DbExceptionUpdate(String msg) {
            super(msg);
        }
    }

