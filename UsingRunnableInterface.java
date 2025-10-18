public class UsingRunnableInterface {
    public static void main(String[] args) {
        // myTask mt = new myTask(5);
        // Thread t = new Thread(new myTask(5));
        // t.start();

        new EvenThread().start();
        new OddThread().start();
    }
}

class EvenThread extends Thread{
    @Override
    public void run() {
        for(int i = 2; i<=10; i=i+2){
            System.out.println("Even : " + i);
        }
    }
}

class OddThread extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<=9; i=i+2){
            System.out.println("Odd : " + i);
        }
    }
}


//This is one way
// class myTask implements Runnable{
//     private int n;

//     myTask(int n){
//         this.n = n;
//     }
//     public void run(){
//         //System.out.println("Runnable");
//         for(int i = 1; i<=n; i++){
//             if(i % 2 == 0){
//                 System.out.println(i + " is Even");
//             }else{
//                 System.out.println(i + " is Odd");
//             }
//         }
//     }
//}

