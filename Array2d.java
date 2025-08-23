public class Array2d {
    public static void main(String[] args) {
        String[] arr1 ={"apples","bananas"};
        String[] arr2 ={"guava","litchi","coconuts"};

        String[][] arr3 = {arr1,arr2};

        for (String[] fruits : arr3){
            for (String fruit : fruits){
                System.out.print(fruit + " ");
            }
            System.out.println();
        }

    }
}
