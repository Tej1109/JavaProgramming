import  java.util.Scanner;
public class shoppingcart {
 public  static  void  main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int qty;
     String item;
     char currency;
     double price;
     double total;
     System.out.println("Welcome to Shopping Cart Program!");
     System.out.print("What item are you buying? : ");
     item = scanner.nextLine();
     System.out.print("How much are you buying? : ");
     qty = scanner.nextInt();
     System.out.print("What is the price of 1 unit : ");
     price = scanner.nextDouble();
     System.out.print("What is your currency? : ");
     currency = scanner.next().charAt(0); //charAt to limit the ip
     total = price*qty;
     System.out.println("Hi you are buying : " + qty + " " + item+ "\\s");
     System.out.println("Your total price is : " + currency+total);
     scanner.close();
 }
}
