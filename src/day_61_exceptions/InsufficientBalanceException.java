package day_61_exceptions;

/**
 * custom extends exception
 * that extends RuntimeException
 */

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException() {}

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
