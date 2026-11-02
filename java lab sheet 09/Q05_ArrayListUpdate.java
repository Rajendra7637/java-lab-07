import java.util.ArrayList;

public class Q05_ArrayListUpdate {
    public static void main(String[] args) {
        System.out.println("=== Q05: Update Element at Given Index ===");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("C");
        languages.add("C++");
        languages.add("Python");
        languages.add("Ruby");
        System.out.println("Before update: " + languages);

        // Update element at index 3 to Java
        String oldVal = languages.set(3, "Java");
        System.out.println("Replaced '" + oldVal + "' at index 3 with 'Java'");
        System.out.println("After update : " + languages);
    }
}
