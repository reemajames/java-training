package com.ust.swiggy.exception;

public class NoEntryException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 5294177700406714766L;

    public NoEntryException() {
    }

    public NoEntryException(String message) {
        super(message);
    }
    public NoEntryException(Throwable cause) {
        super(cause);
    }
}
