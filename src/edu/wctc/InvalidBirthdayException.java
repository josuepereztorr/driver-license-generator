package edu.wctc;

public class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(int year, int month, int day) {
        super(String.format("Invalid Birthday : the given birthday is invalid, %s-%s-%s",year, month, day));
    }
}
