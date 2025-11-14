package DependencyInjectionDemo;

public class App {
    public static void main(String[] args) {
        //Dependency Injection using Setter() method
//        Student s = new Student();
//        Course course = new DSA();
//        s.study(course);

        //Dependency Injection using Constructor()
//        Student s = new Student(new DSA());
//        s.study();

        //Field Injection
        Student s = new Student();
        s.course = new DSA();
        s.study();

        //Note :- In Manual Injection we need to make variable public otherwise it will not be available outside class.
        //But in Spring Core we don't need to make variables public

    }
}
