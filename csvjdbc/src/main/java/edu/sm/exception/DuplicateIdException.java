package edu.sm.exception;

public class DuplicateIdException extends Exception {
    public DuplicateIdException() {}
    public DuplicateIdException(String message) {
        super(message);
    }
}
