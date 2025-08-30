import java.util.Scanner;
public class RuntimePolymorphism {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("Please enter what u want : \n1. Cat\n2. Dog");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1){
            animal = new Cat();
            animal.says();
        }
        else if (choice == 2){
            animal = new Dog();
            animal.says();
        }
        else {
            System.out.println("Enter a valid option dawg");
        }
    }
}
