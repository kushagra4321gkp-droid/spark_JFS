class mythread extends Thread{
    public void run(){
        //System.out.println("my thread is running");
        for(int i = 0; i<5; i++){
            System.out.println("thread");
        }
    }
}
public class multiThreading_MainThread {
    public static void main(String[] args) {
        System.out.println("thread name " + Thread.currentThread().getName());

        mythread t = new mythread();
        t.start();
        //if i don't override run method, and i extend Thread and do t.start(). thread will still be created. 
        //if instead of t.start() i do t.run(). normal execution will occur. no thread will be created

        for(int i = 0; i<5; i++){
            System.out.println("main");
        }
    }
}