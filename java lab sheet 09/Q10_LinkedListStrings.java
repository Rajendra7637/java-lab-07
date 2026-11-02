import java.util.LinkedList;

public class Q10_LinkedListStrings {
    public static void main(String[] args) {
        System.out.println("=== Q10: LinkedList of Strings ===");
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Kotlin");
        list.add("Scala");
        list.add("Groovy");

        System.out.println("LinkedList elements: " + list);
        System.out.println("Size of LinkedList: " + list.size());
    }
}
