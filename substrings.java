import  java.util.Scanner;
public class substrings {
    public static void  main(String[] args){
        // substrings are used to slice strings as we know
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your email address here: ");
        String email = scanner.nextLine();
        if (!email.contains("@")){
            System.out.println("An email address should contain @ symbol!!");
        }
        else {
            String username = email.substring(0,email.indexOf("@"));
            String  domain = email.substring(email.indexOf("@")+1);
            System.out.println("Username: "+username);
            System.out.println("Domain: "+domain);
        }
        scanner.close();
    }
}
