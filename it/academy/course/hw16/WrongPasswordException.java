package it.academy.course.hw16;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }
}
