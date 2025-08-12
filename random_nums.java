import java.util.Random;
public class random_nums {
    public static void main(String[] args){
        Random random = new Random();
        int rand1 = random.nextInt(1,11); // from 1 to 10
        double rand2 = random.nextDouble(1,11);// double from 1 to 10
        boolean rand3 = random.nextBoolean();// binary outcome
        System.out.println("Random 1 " + rand1);
        System.out.println("Random 2 " + rand2);
        System.out.println("Random 3 " + rand3);

    }
}
