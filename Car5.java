public class Car5 {
    String model;
    int year;
    Engine engine;

    Car5(String model,int year,String type){
        this.model = model;
        this.year = year;
        this.engine = new Engine(type);
    }

    public void start(){
        this.engine.start();
        System.out.println(this.model + " of year " + this.year + " is running!");

    }
}
