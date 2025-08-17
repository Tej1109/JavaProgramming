/* Enhanced switches allow multiple cases to be present in a single loc
quite interesting.
 */
import java.util.Scanner;
public class enhancedSwitches {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day : ");
        String day = scanner.nextLine();
        switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("Weekday oof");
            case "Saturday","Sunday" -> System.out.println("Weekend!!");
            default  -> System.out.println("Not a day");}
    scanner.close();}}

