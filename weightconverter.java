
import java.util.Scanner;

public class weightconverter {
    /* Welcome Message
    Ask for Choice
    if 1 kg to pound, ask weight, convert and print
    if 2 pound to kg, ask weight, convert and pring
    else print enter a valid choice
     */
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight_kgs;
        double weight_lbs;
        System.out.println("Hi!, Welcome to Weight Converter Program");
        System.out.println("Please choose from the following:\n1 for kg to pound\n2 for pound to kg");
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Please enter your weight in kgs: ");
            weight_kgs = scanner.nextDouble();
            weight_lbs = weight_kgs * 2.205;
            System.out.printf("%.2f Kilograms in Pounds is %.2f",weight_kgs,weight_lbs);
        }
        else if (choice == 2){
            System.out.print("Please enter your weight in lbs: ");
            weight_lbs = scanner.nextDouble();
            weight_kgs = weight_lbs / 2.205;
            System.out.printf("%.2f Pounds in Kilograms is %.2f",weight_lbs,weight_kgs);
        }
        else {
            System.out.println("Please enter a valid option thanks");
        }
        scanner.close();
    }
}
