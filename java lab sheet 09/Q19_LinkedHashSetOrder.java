import java.util.LinkedHashSet;

public class Q19_LinkedHashSetOrder {
    public static void main(String[] args) {
        System.out.println("=== Q19: LinkedHashSet Maintains Insertion Order ===");
        LinkedHashSet<String> orderSet = new LinkedHashSet<>();
        orderSet.add("First");
        orderSet.add("Second");
        orderSet.add("Third");
        orderSet.add("Fourth");
        orderSet.add("Fifth");
        orderSet.add("Second"); // duplicate

        System.out.println("LinkedHashSet elements:");
        for (String s : orderSet) {
            System.out.println("-> " + s);
        }
        System.out.println("Observation: Insertion order is preserved and duplicates rejected.");
    }
}
