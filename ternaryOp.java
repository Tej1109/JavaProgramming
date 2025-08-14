import  java.util.Scanner;
public class ternaryOp {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = scanner.nextInt();
        String stat = (age >= 18) ? "Can Vote" : "Cannot Vote";
        System.out.println(stat);
    }
}
