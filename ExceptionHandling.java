public class ExceptionHandling {
    public static void main(String[] args) {
        //An Exception is Runtime Object representing a problem that interrupts the flow of your program OR
        //An unwanted event that interrrupt the flow of the program

        ExceptionHandling obj = new ExceptionHandling();
        
        Class<?> c = obj.getClass();

        System.out.println("SuperClass of ExceptionHandling class " + c.getSuperclass().getName());

    }
}
