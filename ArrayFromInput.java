import  java.util.Scanner;
public class ArrayFromInput {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want  : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i ++ ){
            System.out.printf("Enter the %d string element you wanna add: ",i+1);
            arr[i] = scanner.nextLine();
        }
        for (String elmnt : arr ){
            System.out.println(elmnt);
        }
        scanner.close();
    }
}
