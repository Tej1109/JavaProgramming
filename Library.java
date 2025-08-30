public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.books = books;
        this.year = year;
    }

    void showInfo(){
        System.out.println(this.name  + " established in the year " + year);
        System.out.println("We have the following books available : ");
        for (Book book : this.books){
            book.displayInfo();
        }
    }
}

