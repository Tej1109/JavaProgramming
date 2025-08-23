public class Car2 {
    String model;
    String color;

    Car2(String model, String color){
        this.model = model;
        this.color = color;

    }

    void show_car(){
        System.out.println("You are driving " + this.color + " " + this.model);
    }
}
