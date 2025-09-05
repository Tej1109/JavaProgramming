public class Composition {
    // Composition shows a part of relationship rather than aggregation that shows a has a relationship,
    // this means part of objects cannot exist outside the class containing
    // such as engine of a car, if car is deleted engine never can be instantiated(it can as a separate object tho)
    public  static  void  main(String[] args){
        Car5 car5 = new Car5("Corvette",2024,"V8");

        System.out.println(car5.engine);

        car5.engine.start();
        System.out.println();
        car5.start();
    }

}
