public abstract class Shape {

    abstract double area(); //abstract method, no block, needs to be implemented in all children

    void isShape(){ //Concrete method, just like normal methods gets inherited.
        System.out.println("It's a shape!");
    }
}
