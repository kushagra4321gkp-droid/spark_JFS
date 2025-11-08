package Practice_Sessions;

class myThread1 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<=5; i++){
            System.out.println("t1");
        }
    }
}

class myThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<=5; i++){
            System.out.println("t2");
            try {
                myThread2.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultiThreading_ {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Thread.currentThread().getName());
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t1.join();
        t2.start();

            for(int i = 1; i<=5; i++){
                System.out.println("main");
            }
    }
}
