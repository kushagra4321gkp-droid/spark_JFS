public class ThreadClassMthods {
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName());
        //want to change name 
        Thread t = Thread.currentThread();
        t.setName("mera Thread");
        System.out.println(Thread.currentThread().getName());
    }
}
