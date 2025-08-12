public class variables {
    public static void main(String[] args){
        int year = 2024;
        double price = 19999.23;
        String model = "Mustang";
        char currency = '$';
        boolean forSale = true;
        System.out.println("Hi Your car is " + model + " of the year "+year+" priced "+ currency + price);
        if (forSale){
            System.out.println("It is on Sale!!");
        }
        else {
            System.out.println("Sorry its not on sale :(");
        }
    }

}
