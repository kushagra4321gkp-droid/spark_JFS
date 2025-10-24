public class Throw_Usecase {
    public static void main(String[] args){
//        int bal; double amt;
        try{
            withdraw(1000, 2000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void withdraw(int bal, double amt) throws Exception {
        if(amt > bal){

            throw new Exception("Insufficient balance");
//            try {
//                throw new Exception("Insufficient balance");
//            } catch (Exception e) {
//                System.out.println("error : " + e.getMessage());
//            }
//        }else{
//            System.out.println("withdrawal is successful");
        }
    }
}
