import  java.util.Scanner;
public class Methods {
    public static  void main(String[] args){
        int age;String name;
        int num1 = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.print("Please enter your age : ");
        age = scanner.nextInt();
        happyBirthday(name,age);
        int  cubedNum = cube(num1);
        System.out.println("The number cubed is : " + cubedNum);
        if(checkEligibility(age)){
            System.out.println("You are eligible to vote too!");
        }
        else {
            System.out.println("You are not eligible to vote kiddie!");
        }
    }
    static void happyBirthday(String name, int age){
        System.out.printf("Happy Birthday %s\n",name);
        System.out.printf("You are %d years old\n",age);
    }

    static int cube(int num){
        return num * num * num;
    }

    static boolean checkEligibility(int age){
        return (age>18);
    }




}
