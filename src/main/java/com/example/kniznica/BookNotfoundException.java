package com.example.kniznica;

public class BookNotfoundException extends RuntimeException {
    public BookNotfoundException(String message) {
        super(message);
    }

    public BookNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
