import java.util.ArrayList;

public class Q02_ArrayListSize {
    public static void main(String[] args) {
        System.out.println("=== Q02: Add Elements & Display Size ===");
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Initial size: " + fruits.size());

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Elements added: " + fruits);
        System.out.println("Current size of ArrayList: " + fruits.size());
    }
}
