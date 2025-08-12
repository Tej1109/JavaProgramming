public class stringMethods {
    public static void main(String[] args){
        String name = "Bro Code";
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.replace("o","a");
        name = name.strip();
        char letter  = name.charAt(2);
        int newletter = name.indexOf("a");
        int newnewletter = name.lastIndexOf("a");
        System.out.println(name);
        System.out.println(newletter);
        System.out.println(newnewletter);
        System.out.println(letter);

        if (name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else {
            System.out.println("Your name is " + name);
        }

        if (name.equalsIgnoreCase("Bra Cade")){
            System.out.println("Dude we have the same name");
        }
        else{
            System.out.println("We do not have the same name");
        }

        if (name.contains(" ")){
            System.out.println("Your name contains space");

        }
        else {
            System.out.println("Your name doesnt contain space");
        }
    }

}
