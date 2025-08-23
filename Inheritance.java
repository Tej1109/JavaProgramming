public class Inheritance {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        Cat cat1  = new Cat();
        Plant plant1 = new Plant();
// hierarchy is like :
        // Organism
        //Plant Animal
                // Dog Cat
        System.out.println(dog1.isAlive);
        dog1.says();
        System.out.println(cat1.isAlive);
        cat1.says();
        System.out.println(plant1.isAlive);
        plant1.photosynthesize();

    }
}
