import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckingExceptionType {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader r = new FileReader("kushagra.txt"); 
        //it will be compiled easily but will throw a runtime exception
    }
}
