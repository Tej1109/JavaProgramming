
import  java.util.Scanner;
public class if_statements {
public  static  void  main(String[] args){
    // asking name
    Scanner scanner = new Scanner(System.in);



    System.out.print("Hi!, whats your name: ");
    String name  = scanner.nextLine();
    System.out.print("Please enter your age here: ");

    int age = scanner.nextInt();

    System.out.print("Are you a student: ");
    boolean isStudent = scanner.nextBoolean();
    if (name.isEmpty()){ //string method
        System.out.println("Hey you didnt enter your name: ");
    }
    else {
        System.out.println("Hi "+name+"!");
    }
    // check for adult

    if (age > 65){
        System.out.println("You are a senior citizen.");
    }
    else if (age >= 18){
        System.out.println("You are an adult");
    }
    else {
        System.out.println("You are kiddie");
    }


    // check for Student

    if(isStudent){
        System.out.println("You are a student!");
    }
    else {
        System.out.println("You are not a student!");
    }
    scanner.close();
}
}
