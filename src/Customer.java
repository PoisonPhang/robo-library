import java.util.ArrayList;
import java.util.List;

/**
 * This will hold the names of the books in a list
 */
public class Customer {
    private String name;
    private List<Book> books;

    public Customer(String name) {
        this.name = name;
        this.books = new ArrayList();
    }

    public void checkBook(Book book) {
        books.add(book);
    }

    public Customer() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getBooks() {
        return books;
    }

    public void setBooks(List books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return  name + " Books:"+ books;
    }
}

