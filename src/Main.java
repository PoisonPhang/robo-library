import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<Book> library;
    Scanner input = new Scanner(System.in);

    // Driver method
    public static void main(String[] args) {

    }

    public void addBook() {
        System.out.println("What's the title of the book?");
        String title = input.nextLine();
        System.out.println("What's the author's name?");
        String author = input.nextLine();
        System.out.println("How many pages are there?");
        String pageCount = input.nextLine();
        Book temp = new Book(title, author, pageCount, false);
        library.add(temp);
    }



}
