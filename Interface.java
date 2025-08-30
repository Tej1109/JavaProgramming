public class Interface { //interfaces allow us to multiple inherit and give blueprint to classes with abstract methods.
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish2 fish2 = new Fish2();
        rabbit.flee();
        hawk.hunt();
        fish2.flee();
        fish2.hunt();

    }
}
