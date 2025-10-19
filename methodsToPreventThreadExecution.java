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

class joinMethod extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<=5; i++){
            System.out.println("child Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class methodsToPreventThreadExecution {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Thread.currentThread().getName());

        // thread1 t1 = new thread1();
        // thread1 t2 = new thread1();

        // t1.start();
        // t2.start();

        // sleepMethod sle_ep = new sleepMethod();
        // sle_ep.start();

        //sleep() -> sleep method pause the current thread for specified number of miliseconds
        //join() -> When one thread calls join() on another - it says: I will wait until you are done!

        joinMethod joi_n = new joinMethod();
        joi_n.start();
        joi_n.join(); // main -> jo line execute karega wahi wait karega
        for(int i = 0; i<5; i++){
            System.out.println("main Thread");

        }
    }
}
