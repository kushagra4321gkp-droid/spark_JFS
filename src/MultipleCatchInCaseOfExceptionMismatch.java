public class MultipleCatchInCaseOfExceptionMismatch {
    public static void main(String[] args) {
        String s = null;
        System.out.println("before handling");
        try{
            int length = s.length();
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic Exception");
        }
        catch(NullPointerException n){
            System.out.println("NullPointer Exception");
        }
        catch(Exception e){
            System.out.println("Exception...");
        }
        System.out.println("after handling");

        //if you don't know about which exception the code will throw you follow multiple catch block technique to avoid exception mismatch.
        //write hierarchy from child to parent.
        //always code in a way that child will come first in a catch block
    }
}