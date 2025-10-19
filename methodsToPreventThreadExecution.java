class thread1 extends Thread{
    @Override
    public void run() {
        
        for(int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.yield();
        }
    }
}

class thread2 extends Thread{
    @Override
    public void run() {
        
        for(int i = 1; i<9; i=i+2){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class sleepMethod extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<=5; i++){
            System.out.println(getName() + " " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
    }
}

public class methodsToPreventThreadExecution {
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName());

        // thread1 t1 = new thread1();
        // thread1 t2 = new thread1();

        // t1.start();
        // t2.start();

        sleepMethod sle_ep = new sleepMethod();
        sle_ep.start();
    }
}
