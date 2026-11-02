import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Q30_ClearCollections {
    public static void main(String[] args) {
        System.out.println("=== Q30: Clearing Elements from List, Set & Queue ===");

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");

        Set<String> set = new HashSet<>();
        set.add("Alpha");
        set.add("Beta");

        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");

        System.out.println("Before clear:");
        System.out.println("  List  size: " + list.size());
        System.out.println("  Set   size: " + set.size());
        System.out.println("  Queue size: " + queue.size());

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("\nAfter clear():");
        System.out.println("  List  isEmpty? " + list.isEmpty() + " (size: " + list.size() + ")");
        System.out.println("  Set   isEmpty? " + set.isEmpty() + " (size: " + set.size() + ")");
        System.out.println("  Queue isEmpty? " + queue.isEmpty() + " (size: " + queue.size() + ")");
    }
}
