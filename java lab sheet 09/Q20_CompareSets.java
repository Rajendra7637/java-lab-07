import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Q20_CompareSets {
    public static void main(String[] args) {
        System.out.println("=== Q20: Compare HashSet, LinkedHashSet & TreeSet ===");
        List<Integer> input = Arrays.asList(40, 10, 50, 20, 30, 10, 40);
        System.out.println("Original Input with duplicates: " + input);

        HashSet<Integer> hashSet = new HashSet<>(input);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(input);
        TreeSet<Integer> treeSet = new TreeSet<>(input);

        System.out.println("\n1. HashSet (Unordered / Hash bucket order):");
        System.out.println("   " + hashSet);

        System.out.println("\n2. LinkedHashSet (Preserves Insertion Order):");
        System.out.println("   " + linkedHashSet);

        System.out.println("\n3. TreeSet (Sorted Natural Ascending Order):");
        System.out.println("   " + treeSet);
    }
}
