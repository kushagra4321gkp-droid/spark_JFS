public class ThrowThrows {
    public static void main(String[] args) {
        try{
            CheckAgeCal(1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

//    You use throw to generate (throw) a custom or predefined exception.
//    And throws to delegate that exception’s handling responsibility to whoever calls that method.

    public static void CheckAgeCal(int age) throws Exception{
        if(age < 0){
            throw new Exception("age can not be negative!");
        }
        if(age < 18){
            throw new Exception("you are underage!");
        }
    }
}
