public class MethodOverriding {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.isMoving();
        cat.isMoving();
        fish.isMoving(); // this method is overriden. @override

    }
}
