import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q28_ListToSetDuplicates {
    public static void main(String[] args) {
        System.out.println("=== Q28: Convert List to Set (Duplicate Removal) ===");
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Mango");
        fruitsList.add("Banana");
        fruitsList.add("Apple");
        fruitsList.add("Orange");
        fruitsList.add("Mango");

        System.out.println("Original List with duplicates (size=" + fruitsList.size() + "):");
        System.out.println(fruitsList);

        Set<String> fruitsSet = new HashSet<>(fruitsList);
        System.out.println("\nConverted Set without duplicates (size=" + fruitsSet.size() + "):");
        System.out.println(fruitsSet);
    }
}
