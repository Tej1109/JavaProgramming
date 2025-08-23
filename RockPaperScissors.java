import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock","Paper","Scissor"};
        String compChoice;
        String userChoice;
        char quit ='n';
        System.out.println("Welcome to Rock Paper Scissors Game!");
        do {
            System.out.print("Enter your choice - Rock, Paper or Scissor :");
            userChoice  = scanner.nextLine().toLowerCase();
            compChoice = options[random.nextInt(0,3)].toLowerCase();
            if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissor")){
                if (userChoice.equals("rock") && compChoice.equals("scissor")){
                    System.out.println("You chose " + userChoice);
                    System.out.println("Computer chose " + compChoice);
                    System.out.println("You have won!");
                }
                else if (userChoice.equals("scissor") && compChoice.equals("paper")){
                    System.out.println("You chose " + userChoice);
                    System.out.println("Computer chose " + compChoice);
                    System.out.println("You have won!");
                }
                else if (userChoice.equals("paper") && compChoice.equals("rock")){
                    System.out.println("You chose " + userChoice);
                    System.out.println("Computer chose " + compChoice);
                    System.out.println("You have won!");
                }
                else if (userChoice.equals(compChoice)){
                    System.out.println("You chose " + userChoice);
                    System.out.println("Computer chose " + compChoice);
                    System.out.println("It's a tie!");
                }
                else {
                    System.out.println("You chose " + userChoice);
                    System.out.println("Computer chose " + compChoice);
                    System.out.println("You have lost!");
                }
            }
            else {
                System.out.println("Please enter a valid choice!");
                continue;}

            System.out.print("Do you want to quit? : yes/no ");
            quit = scanner.nextLine().toLowerCase().charAt(0);
            if (quit == 'y'){
                System.out.println("Thanks for playing!");
            }

        } while (quit != 'y');
        // Get machine to choose

        // Get user to choose
        // check if invalid choice
        // else check for condition of winning
        // ask if user wants to quit;
    }
}
