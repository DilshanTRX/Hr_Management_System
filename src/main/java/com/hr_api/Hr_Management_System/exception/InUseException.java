package com.hr_api.Hr_Management_System.exception;

public class InUseException extends RuntimeException {
    public InUseException(String message) {
        super(message);
    }

    public InUseException() {
    }
}
