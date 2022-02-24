package edu.wctc;

public class MissingNameException extends Exception {
    public MissingNameException(String nameType) {
        super(String.format("Missing Name : '%s' cannot be blank or missing", nameType));
    }
}
