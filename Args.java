public class Args {
    public static void main(String[] args){
        Add(1,2,3);}

    static void  Add(int... nums){
    int total = 0;
    for (int num : nums){
    total += num;}
        System.out.println("Total is " + total);}
}