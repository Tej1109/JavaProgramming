import java.util.Scanner;
import  java.util.Random;
public class randomGuesser {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 0;
        int compChoice = random.nextInt(1,11);
        int userChoice;
        System.out.println("Welcome to Number guessing game!");
        do {
            System.out.print("Enter your guess bw 1 and 10: ");
            userChoice = scanner.nextInt();
            attempts++;
            if (userChoice > compChoice){
                System.out.println("Real Answer is Lower");
            }
            else if (userChoice <compChoice){
                System.out.println("Real Answer is Higher");
            }
        } while (userChoice != compChoice);
        System.out.printf("Computer chose %d\nYou chose %d\nCongrats you have won in %d attempts!",compChoice,userChoice,attempts);
        scanner.close();
    }

}
