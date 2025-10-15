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

        for(int i = 0; i<5; i++){
            System.out.println("main");
        }
    }
}