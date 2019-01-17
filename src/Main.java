import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Book> library;
    private static List<Customer> users;
    private static Scanner input = new Scanner(System.in);

    private static void checkout() {
        int bookIndex = 0;
        int personIndex = 0;
        for (int i=0; i < library.size(); i++) {
            System.out.println("[" + (i+1) + "]   " + library.get(i));

        }


        System.out.println("Choose the book.");
        bookIndex = input.nextInt();
        bookIndex--;


        for (int i=0; i < users.size(); i++) {
            System.out.println("[" + (i+1) + "]   " + users.get(i));

        }

        System.out.println("Choose the customer.");
        personIndex = input.nextInt();
        personIndex--;

        if (!library.get(bookIndex).isCheckedOut()) {
            users.get(personIndex).checkBook(library.get(bookIndex));
            library.get(bookIndex).setCheckedOut(true);
            System.out.println(library.get(bookIndex).getTitle() + " was checked out.");
        } else {
            System.out.println(library.get(bookIndex).getTitle() + " is already checked out.");
        }

    }

    private static void returnBook() {


        for (int i=0; i < users.size(); i++) {
            System.out.println("[" + (i+1) + "]   " + users.get(i));
        }
        int personIndex = input.nextInt();
        personIndex--;

        for (int i = 0; i < users.get(i).getBooks().size(); i++) {
            System.out.println("[" + (i+1) + "]" + users.get(personIndex).getBooks().get(i));
        }

    }

    // Driver method
    public static void main(String[] args) {

        boolean run = true;
        String userInput = "";

        library = new ArrayList<>();
        Book book1 = new Book("Prince of Thorns", "Mark Lawrence", "209", false);
        library.add(book1);
        Book book2 = new Book("Game of Thrones", "Jon Snow", "351", false);
        library.add(book2);
        Book book3 = new Book("Once Upon a Deadpool", "Deadpool", "100", false);
        library.add(book3);
        Book book4 = new Book("Spawn", "Todd McFarlane", "13", false);
        library.add(book4);
        Book book5 = new Book("Tesla Changed my Testies", "Elon Musk", "1000000000", false);
        library.add(book5);
        Book book6 = new Book("Threat Level Midnight", "Michael Scott", "234", false);
        library.add(book6);
        Book book7 = new Book("The Black Waves", "Grace Cress", "150", false);
        library.add(book7);
        Book book8 = new Book("Mustache Extrordinare", "Gracie Cress", "905", false);
        library.add(book8);
        Book book9 = new Book("End my Suffering", "Anonomous", "5", false);
        library.add(book9);
        Book book10 = new Book("Stranger Things", "The Duffer Brothers", "11", false);
        library.add(book10);
        Book book11 = new Book("Alex Rider", "Anthony Horrowitz", "311", false);
        library.add(book11);
        Book book12 = new Book("Snack Time", "Food Masters", "55", false);
        library.add(book12);
        Book book13 = new Book("Science Textbook", "Scientists", "280", false);
        library.add(book13);
        Book book14 = new Book("Math Textbook", "Mathematicians","280", false );
        library.add(book14);
        Book book15 = new Book("The Lemon Party", "Mark Zucc", "330", false);
        library.add(book15);
        Book book16 = new Book("How to Build Parks", "Leslie Knope", "567", false);
        library.add(book16);
        Book book17 = new Book("Magic", "Johnny Cash", "245", false);
        library.add(book17);
        Book book18 = new Book("Slash Slinging Slasher", "Squidward", "321", false);
        library.add(book18);
        Book book19 = new Book("Killing Waves", "Hailey Ford", "234", false);
        library.add(book19);
        Book book20 = new Book("Mashed Potatoes", "Jessica Chevy", "235", false);
        library.add(book20);

        users = new ArrayList<>();

        Customer customer1 = new Customer("Akasha Snow");
        users.add(customer1);
        Customer customer2 = new Customer("Grace Cress");
        users.add(customer2);
        Customer customer3 = new Customer("Hannah Wilson");
        users.add(customer3);
        Customer customer4 = new Customer("Trinity Beach");
        users.add(customer4);
        Customer customer5 = new Customer("Sarah Dunn");
        users.add(customer5);

        System.out.println("Hello, do you want to check in or check out books? \n" +
                "[i] to check in \n" +
                "[o] to check out");

        while (run) {
            userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("i")) {

            }
            else if (userInput.equalsIgnoreCase("o")) {
                checkout();
            } else {
                System.out.println("Enter valid command");
            }
        }

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

    public void removeBook() {
        System.out.println("What's the title of the book?");
        String title = input.nextLine();
        System.out.println("What's the author's name?");
        String author = input.nextLine();
        System.out.println("How many pages are there?");
        String pageCount = input.nextLine();
        Book temp = new Book(title, author, pageCount, false);
        library.remove(temp);
    }


}
