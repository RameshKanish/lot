package AddException;

public class InvalidCarTypeException extends Exception{
    public InvalidCarTypeException (String message) throws InvalidCarTypeException {
        super(message);
    }
}