package estepanek;

/**
 * Exception for when stack is empty
 * @author Eva Stepanek
 * @version 2024-02-13
 */
public class StackEmptyException extends RuntimeException{
    /**
     * exception with own error message
     * @param message variable
     */
    public StackEmptyException(String message){
        super(message);
    }
}
