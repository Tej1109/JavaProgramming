import  java.util.Scanner;
public class BankingProgram {
    static Scanner scanner = new Scanner(System.in); //global scanner can be used in methods itself, use static keyword
    public  static void main(String[]  args ){
        char userChoice; double balance;
        System.out.println("Hi! Welcome to the Bank!");
        System.out.print("Please enter your balance : ");
        balance = scanner.nextDouble();
        do {
            System.out.print("Please select the following operations : \nW for Withdraw  \nB for Balance \nD for Deposit \nQ to quit this Menu.");
            userChoice = scanner.next().toUpperCase().charAt(0);
            switch (userChoice){
                case 'W' -> balance = withdraw(balance);
                case 'D' -> balance = deposit(balance);
                case 'B' -> System.out.printf("Your balance is : %.2f \n", balance);
                case 'Q' -> { System.out.println("Your final balance is : " + balance);
                    System.out.println("Thanks for using our Bank!");}
                default -> System.out.println("Please enter a valid choice!");

            }
        } while (userChoice != 'Q');


    }
    static double withdraw(double balance){
        System.out.print("How much do you want to withdraw: ");
        double withdraw = scanner.nextDouble();
        if (balance >= withdraw){
            balance -= withdraw;
            System.out.printf("%.2f withdrawn successfully\nnew balance is : %.2f \n",withdraw,balance);}
        else {
            System.out.println("Withdraw amount cannot be greater than the balance!");}
        return balance;
    }

    static  double deposit(double balance){
        System.out.print("How much do you want to deposit: ");
        double deposit = scanner.nextDouble();
        if (deposit < 0){
            System.out.println("Deposit Failed!");
            System.out.println("Deposit cannot be Negative");
        }
        else {
            balance += deposit;
            System.out.printf("Your Deposit of %.2f is Successful\n",deposit);
            System.out.printf("Your Balance is  : %.2f\n",balance);
        }
        return  balance;

    }
}
