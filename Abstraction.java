public class Abstraction {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(2,4);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3,2);

        System.out.println(rectangle.area());
        System.out.println(circle.area());
        System.out.println(triangle.area());

        circle.isShape(); // Concrete method called easily
    }
}
