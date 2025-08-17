public class OverloadedMethods {
    public static void main(String[] args){
        /*
        Remember signature = params + method name --> this identifies the uniqueness of each method.
        Two methods cannot have same signature.
        */
        bakePizza("Flatbread");
        bakePizza("Flatbread","Mozzarella");
    }
    static void bakePizza(String bread){
        System.out.println(bread  + " " + "pizza");
    }

    static void bakePizza(String bread, String cheese){
        System.out.println(cheese + " " + bread + " " + "pizza");
    }
}
