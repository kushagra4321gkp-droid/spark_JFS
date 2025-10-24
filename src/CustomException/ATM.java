package CustomException;

public class ATM {
    public static void main(String[] args) {
        try {
            withdraw(2000, 1000);
        }
        catch (InsufficientBalException i){
            System.out.println(i.getMessage());
            System.out.println(i);
        }
    }

    public static void withdraw(double amt, double bal) throws InsufficientBalException{
        if(amt > bal){
            throw new InsufficientBalException("Insufficient balance -> " + bal + ", requested amount is " + amt);
        }

    }
}
