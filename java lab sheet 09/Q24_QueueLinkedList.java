import java.util.LinkedList;
import java.util.Queue;

public class Q24_QueueLinkedList {
    public static void main(String[] args) {
        System.out.println("=== Q24: Queue Reference to LinkedList ===");
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");
        System.out.println("Queue after additions: " + queue);

        // Remove elements
        String served = queue.remove();
        System.out.println("Served (removed): " + served);
        System.out.println("Queue after serving: " + queue);
    }
}
