import java.util.TreeSet;

public class Q17_TreeSetSorted {
    public static void main(String[] args) {
        System.out.println("=== Q17: TreeSet Sorted Elements ===");
        TreeSet<Integer> treeSet = new TreeSet<>();
        // Add elements in random order
        treeSet.add(45);
        treeSet.add(12);
        treeSet.add(99);
        treeSet.add(3);
        treeSet.add(56);
        treeSet.add(28);

        System.out.println("TreeSet automatically sorts elements in ascending order:");
        System.out.println("Result: " + treeSet);
    }
}
