public class Generics {
    public static void main(String[] args){
        Product<String,Integer> prod1 = new Product<>("Ticket",15);
        System.out.println(prod1.getItem());
        System.out.println(prod1.getPrice());
    }
}
