
import  java.util.Scanner;
import java.util.Random;
public class SlotMachine {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void  main(String[] args){
        System.out.println("Welcome to the Slot Machine!");
        int balance = 100;
        char choice = 'y';
        String[] rows;
        do{
        System.out.print("How much do u want to bet : ");
        int bet = scanner.nextInt();
        if (bet > balance){
            System.out.println("Bet cannot be greater than balance! ");
            continue;
        }
        if (bet <= 0){
            System.out.println("Bet cannot be less than or equal to 0!");
            continue;
        }
        System.out.println("Rolling...");
        rows = spinRows();

        balance -= bet;

        balance += getReward(rows,bet);
        System.out.println("Your balance is : " + balance);
        System.out.print("Do you want to continue  : yes/no ");
        choice = scanner.next().toLowerCase().charAt(0);
        if (choice == 'n'){
            System.out.println("Thanks for playing!");
        }

        }while (choice!='n');
    }

    static String[] spinRows(){
        String[] symbols =  {"⭐","🔔","🍋","🍒","🍉"};
        String[] rows  = new String[3];
        for (int i = 0; i<rows.length; i++){
            rows[i] = symbols[random.nextInt(symbols.length)];
        }
        System.out.println(String.join("|",rows));
        return rows;
    }

    static int getReward(String[] row, int bet){
        int reward = 0;
        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            switch (row[0]){
                case "🍉" -> {
                    System.out.println("Double Profit");
                    reward = bet*2;}
                case "🍒" -> {
                    System.out.println("Triple Profit");
                    reward = bet *3;
                }
                case "🍋" ->{
                    System.out.println("Quadruple Profit");
                    reward = bet * 4;
                }
                case "🔔" ->{
                    System.out.println("Quintuple Profit");
                    reward = bet * 5;
                }
                case "⭐" -> {
                    System.out.println("JACKPOT!!!! \n TEN TIMES PROFIT!!");
                    reward = bet * 10;
                }
            }
        }
        else if (row[0].equals(row[1])) {
            switch (row[0]){
                case "🍉" -> {
                    System.out.println("Original Returned");
                    reward = bet;}
                case "🍒" -> {
                    System.out.println("Double Profit");
                    reward = bet *2;
                }
                case "🍋" ->{
                    System.out.println("Triple Profit");
                    reward = bet * 3;
                }
                case "🔔" ->{
                    System.out.println("Quadruple Profit");
                    reward = bet * 4;
                }
                case "⭐" -> {
                    System.out.println("MINI JACKPOT!!!! \n FIVE TIMES PROFIT!!");
                    reward = bet * 5;
                }
            }

        }
        else if (row[1].equals(row[2])) {
            switch (row[1]){
                case "🍉" -> {
                    System.out.println("Original Returned");
                    reward = bet;}
                case "🍒" -> {
                    System.out.println("Double Profit");
                    reward = bet *2;
                }
                case "🍋" ->{
                    System.out.println("Triple Profit");
                    reward = bet * 3;
                }
                case "🔔" ->{
                    System.out.println("Quadruple Profit");
                    reward = bet * 4;
                }
                case "⭐" -> {
                    System.out.println("MINI JACKPOT!!!! \n FIVE TIMES PROFIT!!");
                    reward = bet * 5;
                }
            }

        }

        return  reward; }
}
