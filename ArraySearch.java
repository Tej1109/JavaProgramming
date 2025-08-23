import java.util.Scanner;
public class ArraySearch {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple" , "banana", "orange"};
        String target;
        boolean isFound = false;

        System.out.print("Enter the element you wanna search : ");
        target = scanner.nextLine();

        for (int i = 0 ; i < fruits.length; i++){
            if (target.equals(fruits[i])){
                System.out.println("Found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Not found in the array");
        }
        scanner.close();




    }
}
