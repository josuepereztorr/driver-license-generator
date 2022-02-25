package edu.wctc;

public class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(int year, int month, int day) {
        super(String.format("Invalid Birthday : '%s-%s-%s' us an invalid birthdate",year, month, day));
    }
}
