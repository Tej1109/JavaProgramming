
import java.util.Scanner;
public class compound_interest {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int time;
        double total;
        System.out.println("Welcome to Compound Interest Calculator!");
        System.out.print("Enter the Principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest in %: ");
        rate = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded in a year:  ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the number of years you want to invest: ");
        time = scanner.nextInt();

        total = principal * Math.pow((1 + ((rate/100)/timesCompounded)), time*timesCompounded);
        System.out.printf("Your total is $%.2f",total);
        System.out.printf("\nTotal interest made: %.2f", total-principal);
        scanner.close();
    }
}
