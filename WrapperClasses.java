public class WrapperClasses {
    public static void  main(String[] args){
        // This is called autopacking
        Integer a = 2;
        Double b = 2.4;
        Character c = 'a';
        Boolean d = true;
        // Now all primitive data types are referenced, why? cuz arraylists only work on wrapper
        // unpacking
        int x = a; //back to primitive

        //some useful methods

        // converting to strings

        String aa = Integer.toString(21);
        String bb = Double.toString(2.34);
        String cc = Character.toString('a');
        String dd = Boolean.toString(true);

        System.out.println(aa + " " + bb + " " + cc + " " + dd );

        // converting Strings to primitive data types

        int aaa = Integer.parseInt("2");
        double bbb = Double.parseDouble("2.454");
        char ccc = "asdjads".charAt(0);
        boolean ddd = Boolean.parseBoolean("true");

        // character methods

        System.out.println(Character.isAlphabetic(ccc));
        System.out.println(Character.isUpperCase(ccc));



    }
}
