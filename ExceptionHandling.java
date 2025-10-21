public class ExceptionHandling {
    public static void main(String[] args) {
        //An Exception is Runtime Object representing a problem that interrupts the flow of your program OR
        //An unwanted event that interrrupt the flow of the program

        ExceptionHandling obj = new ExceptionHandling();
        
        Class<?> c = obj.getClass();

        System.out.println("SuperClass of ExceptionHandling class " + c.getSuperclass().getName());

        //Types of Exception
        //(1) Checked Exception -> These exceptions force compiler to handle explicitly.
            //These exceptions must be handle in try-catch or throws.

        //(2) Unchecked Exception -> These are the exceptions which are not checked at compile  time. These exception will occur during exception!

        //How to Handle Exception 
        //(1) Try-catch-finally

        //   Try : risky code will be place here 
        //// Catch : handles the exception
        /// /Finally : Always execute (clean code)
        /// 
        /// Syntax :
        /// Try
        /// {
        ///   }
        /// Catch(Exception e)
        /// {
        ///   }
        /// Finally
        /// {
        ///   }

    }
}
