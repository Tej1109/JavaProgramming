public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    boolean isRunning = false;

    void startEngine(){
        isRunning = true;
        System.out.println("You have started the engine!");
    }
    void stopEngine(){
        isRunning = false;
        System.out.println("You have stopped the engine!");
    }
}
