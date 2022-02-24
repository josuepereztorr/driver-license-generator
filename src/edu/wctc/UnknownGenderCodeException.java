package edu.wctc;

public class UnknownGenderCodeException extends Exception {
    public UnknownGenderCodeException(char genderCode) {
        super(String.format("Unknown Gender : unknown gender code of '%c'", genderCode));
    }
}
