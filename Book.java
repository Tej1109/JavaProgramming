public class Book {
    String name;
    int pages;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }
    public void displayInfo(){
        System.out.println(this.name + " (" + pages + " pages)");
    }
}
