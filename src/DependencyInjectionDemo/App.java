package DependencyInjectionDemo;

public class App {
    public static void main(String[] args) {
        //Dependency Injection using Setter() method
//        Student s = new Student();
//        Course course = new DSA();
//        s.study(course);

        //Dependency Injection using Constructor()
        Student s = new Student(new DSA());
        s.study();
    }
}
