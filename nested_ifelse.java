public class nested_ifelse {
    public static void main(String[] args){
        boolean isStudent = false;
        boolean isSenior = true;
        double price = 10.00;
        if (isStudent){
            if (isSenior){
                System.out.println("You get a 30% discount for being a Senior and a Student");
                price = 0.7 * price;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price = 0.9 * price;
            }
        }
        else {
            if (isSenior){
                System.out.println("You get a senior discount of 20%");
                price = 0.8 * price;
            }
            else {
                System.out.println("Sorry you get no discount :( ");
            }
        }
        System.out.printf("Total Price is : %.2f", price);
    }
}
