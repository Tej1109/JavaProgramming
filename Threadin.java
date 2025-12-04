import java.util.Scanner;

public class Threadin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 seconds to enter your name: ");
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name);
    }
}
