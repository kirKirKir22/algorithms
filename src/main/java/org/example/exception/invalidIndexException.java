package org.example.exception;

public class invalidIndexException extends RuntimeException {
    public invalidIndexException() {
    }

    public invalidIndexException(String message) {
        super(message);
    }

    public invalidIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidIndexException(Throwable cause) {
        super(cause);
    }

    public invalidIndexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
