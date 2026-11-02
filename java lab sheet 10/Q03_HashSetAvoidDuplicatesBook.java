import java.util.HashSet;
import java.util.Objects;

public class Q03_HashSetAvoidDuplicatesBook {
    // Book class with id, title, and author
    static class Book {
        private int id;
        private String title;
        private String author;

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
        }

        public int getId() {
            return id;
        }

        public void display() {
            System.out.println("Book [ID: " + id + ", Title: '" + title + "', Author: '" + author + "']");
        }

        // Overriding equals and hashCode based on book id to prevent duplicates in HashSet
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return id == book.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "ID " + id + ": " + title;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q03: HashSet to Avoid Duplicate Books ===");
        HashSet<Book> library = new HashSet<>();

        Book b1 = new Book(1, "Effective Java", "Joshua Bloch");
        Book b2 = new Book(2, "Clean Code", "Robert C. Martin");
        Book b3 = new Book(3, "Java: The Complete Reference", "Herbert Schildt");
        Book b4 = new Book(1, "Effective Java 3rd Edition", "Joshua Bloch"); // Duplicate ID 1
        Book b5 = new Book(2, "Clean Code (Paperback)", "Robert Martin");    // Duplicate ID 2

        System.out.println("Adding Book 1: " + library.add(b1));
        System.out.println("Adding Book 2: " + library.add(b2));
        System.out.println("Adding Book 3: " + library.add(b3));
        System.out.println("Adding Book 4 (Duplicate ID 1): " + library.add(b4));
        System.out.println("Adding Book 5 (Duplicate ID 2): " + library.add(b5));

        System.out.println("\n--- Library Books in HashSet (Unique ID enforced) ---");
        for (Book b : library) {
            b.display();
        }
        System.out.println("Total Unique Books in HashSet: " + library.size());
    }
}
