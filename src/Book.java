/**
 * Book object that holds title, author, page count and whether or not it's checked out
 */
public class Book {
    private String title;

    private String author;

    private String pageCount;

    boolean checkedOut;

    public Book(String title, String author, String pageCount, boolean checkedOut) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.checkedOut = checkedOut;
    }

    public Book() {
        this.title = "";
        this.author = "";
        this.pageCount = "";
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}
