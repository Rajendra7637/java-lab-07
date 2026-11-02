import java.util.TreeSet;

public class Q04_TreeSetComparableProduct {
    // Product class implementing Comparable<Product>
    static class Product implements Comparable<Product> {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void display() {
            System.out.printf("Product ID: %-4d | Name: %-15s | Price: $%.2f\n", id, name, price);
        }

        // Sort by price in ascending order
        @Override
        public int compareTo(Product other) {
            int priceCompare = Double.compare(this.price, other.price);
            if (priceCompare != 0) {
                return priceCompare;
            }
            return Integer.compare(this.id, other.id);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q04: TreeSet Sorting Products by Price ===");
        TreeSet<Product> productCatalog = new TreeSet<>();

        // Adding at least 5 products in unsorted price order
        productCatalog.add(new Product(101, "Laptop", 850.00));
        productCatalog.add(new Product(102, "Wireless Mouse", 25.50));
        productCatalog.add(new Product(103, "Mechanical Keyboard", 75.00));
        productCatalog.add(new Product(104, "4K Monitor", 340.00));
        productCatalog.add(new Product(105, "USB-C Hub", 45.99));
        productCatalog.add(new Product(106, "External SSD", 120.00));

        System.out.println("Products automatically sorted by price (Lowest to Highest):");
        System.out.println("------------------------------------------------------------");
        for (Product p : productCatalog) {
            p.display();
        }
    }
}
