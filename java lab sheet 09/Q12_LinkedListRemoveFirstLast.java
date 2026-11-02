import java.util.LinkedList;

public class Q12_LinkedListRemoveFirstLast {
    public static void main(String[] args) {
        System.out.println("=== Q12: Remove First & Last Elements ===");
        LinkedList<String> queue = new LinkedList<>();
        queue.add("FirstEntry");
        queue.add("SecondEntry");
        queue.add("ThirdEntry");
        queue.add("FourthEntry");
        System.out.println("Original: " + queue);

        String removedFirst = queue.removeFirst();
        String removedLast = queue.removeLast();

        System.out.println("Removed first: " + removedFirst);
        System.out.println("Removed last : " + removedLast);
        System.out.println("Resulting LinkedList: " + queue);
    }
}
