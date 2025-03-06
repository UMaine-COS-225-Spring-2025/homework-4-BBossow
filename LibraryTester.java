public class LibraryTester {

    public static void main(String[] args) {

        BookShelf oShelf = new BookShelf("O");
        BookShelf tShelf = new BookShelf("T");

        System.out.println(oShelf);
        System.out.println(tShelf);

        Book b1 = new Book("The Heart of the Betrayed", "Crime");
        Book b2 = new Book("Our Hill of Stars", "Fantasy");
        Book b3 = new Book("One of a Kind", "Science Fiction");
        Book b4 = new Book("The Vision of Roses", "Romance");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        
        oShelf.addBook(b1);
        oShelf.addBook(b2);
        oShelf.addBook(b3);
        oShelf.addBook(b4);

        tShelf.addBook(b1);
        tShelf.addBook(b2);
        tShelf.addBook(b3);
        tShelf.addBook(b4);

        System.out.println(oShelf);
        System.out.println(tShelf);

    
    }
    
}
