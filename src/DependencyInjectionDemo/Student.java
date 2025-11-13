package DependencyInjectionDemo;

public class Student {
    public Course course;

    public Student() {
    }

    public Student(Course course) {
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

//    public void study(Course course){
//        if(course.enroll()>=1){
//            System.out.println("Journey Started...");
//        }else {
//            System.out.println("Payment failed...");
//        }
//    }

    public void study(){
        if(course.enroll()>=1){
            System.out.println("Journey Started...");
        }else {
            System.out.println("Payment failed...");
        }
    }
}
