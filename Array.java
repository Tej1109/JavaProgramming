import java.util.Arrays;
public class Array {
    public static void  main(String[] args){
        String[] arr = {"Apples","Bananas","Apricots"};
        Arrays.sort(arr);
        Arrays.fill(arr,"pineapple");
        for (String fruit : arr){
            System.out.println(fruit);
            System.out.println(fruit);
        }
    }
}
