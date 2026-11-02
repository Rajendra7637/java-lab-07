import java.util.TreeSet;

public class Q18_TreeSetContains {
    public static void main(String[] args) {
        System.out.println("=== Q18: Check if TreeSet Contains Element ===");
        TreeSet<String> names = new TreeSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        System.out.println("Names in TreeSet: " + names);
        System.out.println("Contains 'Bob'?     : " + names.contains("Bob"));
        System.out.println("Contains 'Edward'?  : " + names.contains("Edward"));
    }
}
