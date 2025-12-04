public class Multihreadin {
public static void main(String[] args){
    System.out.println("Game Starts");
    Thread thread1 = new Thread(new PingPong("Ping"));
    Thread thread2 = new Thread(new PingPong("Pong"));
    thread1.start();
    thread2.start();
    try{
        thread1.join();
        thread2.join();
    } catch (InterruptedException e) {
        System.out.println(" WE got interrupted");;
    }
    System.out.println("Game Stopped" +
            "");


}
}
