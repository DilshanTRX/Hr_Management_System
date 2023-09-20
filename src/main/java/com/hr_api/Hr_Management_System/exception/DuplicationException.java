package com.hr_api.Hr_Management_System.exception;

public class DuplicationException extends RuntimeException {
    public DuplicationException() {
        super();
    }

    public DuplicationException(String message) {
        super(message);
    }
}
