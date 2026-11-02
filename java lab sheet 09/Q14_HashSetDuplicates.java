import java.util.HashSet;

public class Q14_HashSetDuplicates {
    public static void main(String[] args) {
        System.out.println("=== Q14: HashSet Duplicate Rejection ===");
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Adding 10: " + set.add(10));
        System.out.println("Adding 20: " + set.add(20));
        System.out.println("Adding 30: " + set.add(30));
        System.out.println("Adding 20 again (duplicate): " + set.add(20));
        System.out.println("Adding 10 again (duplicate): " + set.add(10));

        System.out.println("Final HashSet elements: " + set);
        System.out.println("Observation: Duplicates are not added and HashSet maintains unique values.");
    }
}
