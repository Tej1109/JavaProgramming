import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name here: ");
        /* Remember, when taking ip of double or int before
        a string, make sure that newline char is gotten rid of,
        just run scanner.nextLine() or next once
         */
        String name = scanner.nextLine(); // to get only till first space use scanner.next(), also for string its line
        System.out.print("Please enter your age here:  ");
        int age = scanner.nextInt();
        System.out.print("Please enter your currency here:  ");
        char currency = scanner.next().charAt(0);
        System.out.print("Please enter your gpa here:  ");
        double gpa = scanner.nextDouble();
        System.out.print("Are you a student? (true/false):  ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gpa is "  + gpa);
        System.out.println("Your currency is "  + currency);

        if (isStudent){
            System.out.println("You are a Student");
        }
        else {
            System.out.println("You are not a StUDENT");
        }
        scanner.close();

    }
}
