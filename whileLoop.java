import java.util.Scanner;
public class whileLoop {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.print("Hi what is your name? : ");
            name = scanner.nextLine();
        } while (name.isEmpty());
        System.out.println("Hi your name is : "+name);
    }
}
