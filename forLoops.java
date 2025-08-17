public class forLoops {
    public static void main(String[] args) throws InterruptedException{
        int cd = 10;
        for (int i = cd; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
