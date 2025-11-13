package TightCoupling;

public class Car {
    Engine engine = new Engine();

    public void drive(){
        engine.start();
        System.out.println("car is moving...");
    }
}
