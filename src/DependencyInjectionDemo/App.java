package DependencyInjectionDemo;

public class App {
    public static void main(String[] args) {
        Student s = new Student();
        Course course = new DSA();
        s.study(course);
    }
}
