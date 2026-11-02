import java.util.LinkedList;

public class Q11_LinkedListAddFirstLast {
    public static void main(String[] args) {
        System.out.println("=== Q11: Add Elements at Beginning & End ===");
        LinkedList<String> items = new LinkedList<>();
        items.add("Item B");
        items.add("Item C");
        System.out.println("Original LinkedList: " + items);

        items.addFirst("Item A (First)");
        items.addLast("Item D (Last)");

        System.out.println("After addFirst and addLast: " + items);
    }
}
