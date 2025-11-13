package DependencyInjectionDemo;

public class Student {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(Course course){
        if(course.enroll()>=1){
            System.out.println("Journey Started...");
        }else {
            System.out.println("Payment failed...");
        }
    }
}
