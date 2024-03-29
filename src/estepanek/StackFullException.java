package estepanek;

/**
 * Exception for when stack is full
 * @author Eva Stepanek
 * @version 2024-02-13
 */
public class StackFullException extends RuntimeException{
    /**
     * exception with own error message
     * @param message variable
     */
    public StackFullException(String message){
        super(message);
    }
}
