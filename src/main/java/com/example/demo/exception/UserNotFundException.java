package com.example.demo.exception;

public class UserNotFundException extends RuntimeException {
    public UserNotFundException() {
    }

    public UserNotFundException(String message) {
        super(message);
    }
}
