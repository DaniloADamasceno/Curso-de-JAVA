package model.Exceptions;

import java.io.Serial;

public class DomainException extends Exception {
        
        @Serial
        private static final long serialVersionUID = 1L;

        //! ---------------------------------------- Constructors   ----------------------------------------------------
        public DomainException(String msg) {
            super(msg);
        }
        
        public DomainException(String msg, Throwable cause) {
            super(msg, cause);
        }
        
}
