public class Car4 {
    private final String model = "Maruti 800"; //not even setter cam assign a value to a variable with final keyword
    private String color = "Red";
    private int year = 2023;

    //Getter
    public void showModel(){
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.year);
    }

    //Setter
    public void setModel(String model, String color,int year){
        this.color = color;
        this.year = year;
        this.showModel();
    }
}
