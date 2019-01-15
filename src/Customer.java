import java.util.List;

/**
 * This will hold the names of the books in a list
 */
public class Customer {
    private String name;
    private List books;

    public Customer(String name, List<Book> books) {
        this.name = name;
        this.books = books;
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
}

