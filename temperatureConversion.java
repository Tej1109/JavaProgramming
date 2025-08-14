import java.util.Scanner;
public class temperatureConversion {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature here : ");
        double temp = scanner.nextDouble();
        double newTemp;
        System.out.print("Enter the conversion unit here: C or F");
        char unit = scanner.next().charAt(0);
        System.out.println(unit);
        newTemp  = (unit == 'F')? (temp *9/5) + 32 : (temp  - 32) *5/9;
        System.out.printf("Your temperature in %s is %.2f°%s",unit,newTemp,unit);
        scanner.close();

    }
}
