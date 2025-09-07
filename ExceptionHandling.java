import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public  static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the number u wanna divide with");
            int den = scanner.nextInt();
            System.out.println("Output is " + (1/den));
        }
        catch (ArithmeticException e){
            System.out.println("You cant divide by zero genius Error :" + " " + e);
        }

        catch (InputMismatchException e){
            System.out.println("Cannot enter a string dude Error : " +  e );
        }
        catch (Exception e){
            System.out.println("There is some error");

        }
        finally {
            System.out.println("This works all the time");
        }
    }
}
