import java.util.LinkedList;

public class Q13_LinkedListGetFirstLast {
    public static void main(String[] args) {
        System.out.println("=== Q13: Retrieve First & Last Elements ===");
        LinkedList<Integer> scores = new LinkedList<>();
        scores.add(95);
        scores.add(82);
        scores.add(77);
        scores.add(99);

        System.out.println("Scores: " + scores);
        System.out.println("First element (getFirst): " + scores.getFirst());
        System.out.println("Last element (getLast)  : " + scores.getLast());
        System.out.println("List remains unchanged  : " + scores);
    }
}
