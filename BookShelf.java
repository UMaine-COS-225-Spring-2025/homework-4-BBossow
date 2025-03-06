import java.util.ArrayList;

public class BookShelf {
    public String shelfLetter;
    ArrayList<Book> bookshelf;

    public BookShelf(String shelfLetter) {
        this.shelfLetter = shelfLetter;
        bookshelf = new ArrayList<Book>(8);
    }

    public void addBook(Book book) {
        String title = book.toString();
        char letter = title.charAt(0);
        char firstLetter = shelfLetter.charAt(0);
        if( letter == firstLetter) {
            bookshelf.add(book);
        }
        
    }

    public void removeBook(Book book) {
        bookshelf.remove(book);
    }

    @Override
    public String toString() {
        if (bookshelf.isEmpty() == true) {
            return "Empty";
        }
        String outStr = "";
        for (int i = 0; i < bookshelf.size(); i++) {
            outStr += bookshelf.get(i).toString();
            outStr += "   "; 
        }
        return outStr;
    }
}
