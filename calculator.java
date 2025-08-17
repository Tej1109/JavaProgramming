import java.util.Scanner;
public class calculator {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2; char choice;
        boolean isValid  = true;
        double result = 0;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the operand  ( + , - , * , / , ^ ) ");
        choice = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch ( choice ) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot divide by zero");
                    isValid = false;
                }
                else {
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);

            default -> {
                System.out.println("Please enter valid operation");
                isValid = false;
            }
        }
        if (isValid){
            System.out.printf("%.2f %c %.2f  = %.2f",num1, choice , num2 , result);
        }
        else {
            System.out.println("Error No Result ");
        }
        scanner.close();




    }
}
