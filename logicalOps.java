/*
&& AND
|| OR
! NOT
 */



import java.util.Scanner;
public class logicalOps {
    public static void main(String[] args){
    // username should have 4-12 chars
    // username should not contain underscore or space
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your username : ");
    String username = scanner.nextLine();
    if (username.length() < 4 || username.length() > 12){
        System.out.println("Username should have 4 to 12 characters.");
    }
    else if (username.contains("_") || username.contains(" ")){
        System.out.println("You cannot have space or underscore in your username! ");
    }
    else {
        System.out.println("Hi " + username);
    }

    scanner.close();
}}
