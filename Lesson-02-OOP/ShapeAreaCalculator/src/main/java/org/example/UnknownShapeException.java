package org.example;

public class UnknownShapeException extends Exception {

    private String exceptionMessage;

    public UnknownShapeException (String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }

}
