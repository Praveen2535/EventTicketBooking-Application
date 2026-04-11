package com.example.springcleanarchitecture.exception;

public class InvalidSeatSelectionException extends RuntimeException {

    public InvalidSeatSelectionException(String message) {
        super(message);
    }
}
