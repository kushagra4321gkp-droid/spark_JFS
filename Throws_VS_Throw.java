import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_VS_Throw {
    public static void main(String[] args) {
        //In java will use throws with method signature, when a method is declared with throws keyword, it means that the responsibility of handling exception is passed to the caller method.
        //in simple words, throws means -> Delegating your Responsibility to the caller method!
    }

    public static void m1(){
        m2("test.txt");
        System.out.println("m1");
    }

    public static void m2(String fileName) throws FileNotFoundException{

        FileReader file = new FileReader("fileName");
    }
}
