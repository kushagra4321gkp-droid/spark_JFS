import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) {
        //In java will use throws with method signature, when a method is declared with throws keyword, it means that the responsibility of handling exception is passed to the caller method.
        //in simple words, throws means -> Delegating your Responsibility to the caller method!
        //we use throws keyword to deligate the responsibility of handling an exception to the caller method.
        try{
            m1();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("exception");
        }
    }

    public static void m1() throws FileNotFoundException{
        m2("test.txt");
        System.out.println("m1");
    }

    public static void m2(String fileName) throws FileNotFoundException{

        FileReader file = new FileReader(fileName);
    }
}
