import java.io.FileInputStream;
import java.io.IOException;

//02:07:00

public class CheckException {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            //FileReader fr = new FileReader("text");
            fis = new FileInputStream("test.txt");
        }
        catch(IOException e){
            System.out.println("Error reading file...");
            System.exit(0); //-> is there any way to stop finally? yes, stop JVM.
        }
        finally{
            //fis.close();
            System.out.println("finally");

        }
    }
}
