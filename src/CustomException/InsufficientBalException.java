package CustomException;

public class InsufficientBalException extends Exception{
    InsufficientBalException(String msg){
        super(msg);
    }
}
