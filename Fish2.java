public class Fish2 implements Predator,Prey{
    @Override
    public  void   hunt(){
        System.out.println("Fish preys on small fishes");
    }

    @Override
    public  void flee(){
        System.out.println("Fish flees from other fishes");
    }
}
