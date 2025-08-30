public class Polymorphism {
    public static void main(String[] args){
        Car3 car3 = new Car3();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car3.go();
        bike.go();
        boat.go();

        System.out.println();
        // now if we want to create an array of objects, its quite weird, we cannot have all datatypes as car, bike or boat
        // but, since they all belong under one superclass, we can give datatype as vehicle

        Vehicle[] vehicles = {bike,car3,boat};
        for (Vehicle vehicle : vehicles ){
             vehicle.go();
        }

         // the same thing can be done with interface too, ie the superclass is an interface
    }


}
