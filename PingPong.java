public class PingPong implements Runnable{
    String text;
    PingPong(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for (int i=1  ; i <= 5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(text);
            }
            catch (InterruptedException e){
                System.out.println("Something happened");
            }
        }
    }
}
