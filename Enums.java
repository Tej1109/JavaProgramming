import java.util.Scanner;

public class Enums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Days days = Days.valueOf(scanner.nextLine().toUpperCase());
        System.out.println(days.getNumDays());
    }
}
