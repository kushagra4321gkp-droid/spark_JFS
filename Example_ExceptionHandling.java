public class Example_ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Before Handling Exception");
        try{
            int i = 10 / 0;
        }
        catch(Exception e){
            System.out.println(e); //.getMessage() , .printStackTrace() , e.toString()
            //e.printStackTrace();
            //System.out.println(e.toString());
        }
        System.out.println("After Handling Exception");
    }
}
