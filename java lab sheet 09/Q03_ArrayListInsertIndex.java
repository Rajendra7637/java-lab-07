import java.util.ArrayList;

public class Q03_ArrayListInsertIndex {
    public static void main(String[] args) {
        System.out.println("=== Q03: Insert Element at Specific Index ===");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("Original list: " + colors);

        // Insert at index 1
        colors.add(1, "Yellow");
        System.out.println("After inserting 'Yellow' at index 1: " + colors);

        // Insert at index 0
        colors.add(0, "Purple");
        System.out.println("After inserting 'Purple' at index 0: " + colors);
    }
}
