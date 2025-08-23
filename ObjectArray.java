public class ObjectArray {
    public static void  main(String[] args){
        Car2[] cars  =  {new Car2("Mustang","Black"), new Car2("Maruti","Red")};
        for (Car2  car : cars){
            car.show_car();
            car.color = "Black";
            car.show_car();
        }
    }
}
