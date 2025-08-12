
public class arithmetic_operators {
    public  static void main(String[] args){
        int x = 2;
        int y = 3;
        int z;
        z = x+y;
//        z = x-y;
//        z = x/y; // make sure the output typecasting
//        z = x*y;
//        z = x%y;
//        x++; increment
//        x--; decrement
        x+= 4; // rapid assignment operator
        // also remember that ts uses PEMDAS
        // while division add a float to ensure retention of float
        double k = x + y - (z/2.0); //gives 7 if 2, and 6.5 if 2.0
        System.out.println(k);
    }
}
