import java.util.HashSet;

public class Q15_HashSetRemove {
    public static void main(String[] args) {
        System.out.println("=== Q15: Remove Element from HashSet ===");
        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Germany");
        System.out.println("Original HashSet: " + countries);

        boolean removed = countries.remove("USA");
        System.out.println("Was 'USA' removed? " + removed);
        System.out.println("After removal: " + countries);

        boolean removeNonExistent = countries.remove("Brazil");
        System.out.println("Attempt to remove 'Brazil': " + removeNonExistent);
    }
}
