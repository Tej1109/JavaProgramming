import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.remove(1);
        arr.set(0,43); // setting the element at 0, mutability
        arr.add(34);
        arr.add(1,25); // add can take position too
        System.out.println(arr);
        Collections.sort(arr); // does inplace
        System.out.println(arr);

        // Taking food array
        ArrayList<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter # of food you want: ");
        int numFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numFood; i++){
            System.out.print("Enter food " + i + " ");
            foods.add(scanner.nextLine());
        }
        System.out.println(foods);

        scanner.close();


    }
}
