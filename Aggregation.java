public class Aggregation {
    //Objects can contain other objects and those other objects can exist independently too
    public static void main(String[] args){
        Book book1 = new Book("Book1",223);
        Book book2 = new Book("Book2",553);
        Book book3 = new Book("Book3",353);

        Book[] books = {book1,book2,book3}; //array of books

//        for (Book book : books){
//            book.displayInfo();
//        }
//
        Library library = new Library("Huntington Library",2004,books);

        library.showInfo();


    }
}
