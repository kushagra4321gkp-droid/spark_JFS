public class catchSkip {
    public static void main(String[] args) {
        try{
            System.out.println("try block...");
        }
        catch(Exception e){
            System.out.println("catch block skipped..."); //if no exception so no catch block execution
        }
        System.out.println("done...");
    }
}
