import java.util.*;

class Book {
    String id;
    String title;
    String author;
    int quantity;

    Book(String title, String author, int quantity) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
}

public class libraryManagement {

    static ArrayList<Book> library = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addBook() {
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Quantity: ");
        int q = sc.nextInt();
        sc.nextLine();

        library.add(new Book(title, author, q));
        System.out.println("Book added.");
    }

    public static void searchBook() {
        System.out.print("Search text: ");
        String s = sc.nextLine().toLowerCase();

        for (Book b : library) {
            if (b.title.toLowerCase().contains(s) || b.author.toLowerCase().contains(s)) {
                System.out.println(b.id + " | " + b.title + " | " + b.author + " | Qty: " + b.quantity);
            }
        }
    }

    public static void borrowBook() {
        System.out.print("Enter Book ID: ");
        String id = sc.nextLine();

        for (Book b : library) {
            if (b.id.equals(id)) {
                if (b.quantity > 0) {
                    b.quantity--;
                    System.out.println("Borrowed successfully.");
                } else {
                    System.out.println("Not available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void returnBook() {
        System.out.print("Enter Book ID: ");
        String id = sc.nextLine();

        for (Book b : library) {
            if (b.id.equals(id)) {
                b.quantity++;
                System.out.println("Returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add\n2. Search\n3. Borrow\n4. Return\n0. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> addBook();
                case 2 -> searchBook();
                case 3 -> borrowBook();
                case 4 -> returnBook();
                case 0 -> { System.out.println("Bye"); return; }
            }
        }
    }
}
