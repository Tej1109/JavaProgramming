
import java.util.Scanner;
import java.util.Random;
public class rollinDice   {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;
        System.out.print("How many dices u wanna roll:  ");
        int rolls = scanner.nextInt();
        for (int i  = 0; i<rolls; i++){
            int compChoice = random.nextInt(1,7);
            dicePrinter(compChoice);
            System.out.println("You rolled : " + compChoice);
            total+= compChoice;
        }
        System.out.println("YOUR TOTAL SUM OF ROLLS IS : " + total);
    }

    static  void dicePrinter(int choice){
        switch (choice){
            case 1 -> System.out.println("""
                    +-------+
                    |       |
                    |   ●   |
                    |       |
                    +-------+""");
            case 2 -> System.out.println("""
                    +-------+
                    | ●     |
                    |       |
                    |     ● |
                    +-------+
                    """);
            case 3 -> System.out.println("""
                    +-------+
                    | ●     |
                    |   ●   |
                    |     ● |
                    +-------+""");

            case 4 -> System.out.println("""
                    +-------+
                    | ●   ● |
                    |       |
                    | ●   ● |
                    +-------+
                    """);
            case 5 -> System.out.println("""
                    +-------+
                    | ●   ● |
                    |   ●   |
                    | ●   ● |
                    +-------+""");
            case 6 -> System.out.println("""
                    +-------+
                    | ●   ● |
                    | ●   ● |
                    | ●   ● |
                    +-------+""");
        }
    }
}