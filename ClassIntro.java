public class ClassIntro{
    public static void main(String[] args){
        Car car = new Car();
        System.out.println("Make : " + car.make);
        System.out.println("Model : " + car.model);
        System.out.println("Year : " + car.year);
        System.out.println("Is Engine Running : " + car.isRunning);

        car.startEngine();
        System.out.println("Is Engine Running : " + car.isRunning);

        car.stopEngine();
        System.out.println("Is Engine Running : " + car.isRunning);
    }
}
