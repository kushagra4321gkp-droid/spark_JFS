package Basics;

public class StaticBlockDemo {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    StaticBlockDemo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method start");
        StaticBlockDemo sb1 = new StaticBlockDemo();
        StaticBlockDemo sb2 = new StaticBlockDemo();

    }
}

//What is Type Checking?
//Type checking means:
//The process of verifying that the data types of variables, expressions, and function calls are used correctly and consistently in a program.
//In simple words —
//it’s the “grammar check” of your program’s data types.

//Static type checking vs Dynamic memory allocation
//Think of Java as:
//“A student (Java) who checks their notes (types) before class starts (compile time),
//but books a seat (memory) only after entering the classroom (runtime).”

//Which is better: Static or Dynamic Type Checking?
//The truth is:
//❌ Neither is “absolutely better.”
//✅ Each has its own strengths and trade-offs, depending on what you value: speed, safety, or flexibility.

//Java is like a strict teacher — checks your homework before you even enter class.
//Python is like a friendly teacher — lets you experiment freely but corrects you only when you make a mistake in class.
