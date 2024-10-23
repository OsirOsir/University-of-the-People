import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibrarySystem {

    private static Map<String, Book> library = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Library System");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addBooks(scanner);
                    break;
                case 2:
                    borrowBooks(scanner);
                    break;
                case 3:
                    returnBooks(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addBooks(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Book book = library.get(title);
        if (book != null) {
            book.setQuantity(book.getQuantity() + quantity);
            System.out.println("Quantity updated.");
        } else {
            library.put(title, new Book(title, author, quantity));
            System.out.println("Book added.");
        }
    }

    private static void borrowBooks(Scanner scanner) {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        System.out.print("Enter number of books to borrow: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Book book = library.get(title);
        if (book != null && book.getQuantity() >= quantity) {
            book.setQuantity(book.getQuantity() - quantity);
            System.out.println("You have successfully borrowed " + quantity + " copies of \"" + title + "\".");
        } else if (book == null) {
            System.out.println("The book does not exist in the library.");
        } else {
            System.out.println("Not enough copies available.");
        }
    }

    private static void returnBooks(Scanner scanner) {
        System.out.print("Enter book title to return: ");
        String title = scanner.nextLine();
        System.out.print("Enter number of books to return: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Book book = library.get(title);
        if (book != null) {
            book.setQuantity(book.getQuantity() + quantity);
            System.out.println("You have successfully returned " + quantity + " copies of \"" + title + "\".");
        } else {
            System.out.println("The book does not exist in the library.");
        }
    }

    private static class Book {
        private String title;
        private String author;
        private int quantity;

        public Book(String title, String author, int quantity) {
            this.title = title;
            this.author = author;
            this.quantity = quantity;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
