import java.util.LinkedList;
import java.util.Queue;

public class Q25_QueueOperations {
    public static void main(String[] args) {
        System.out.println("=== Q25: Add, Remove & Peek in Queue ===");
        Queue<Integer> q = new LinkedList<>();

        // Adding elements using offer() and add()
        q.offer(10);
        q.offer(20);
        q.add(30);
        System.out.println("Queue: " + q);

        // Peeking element
        System.out.println("Peek (head): " + q.peek());

        // Removing elements using poll() and remove()
        System.out.println("Poll: " + q.poll());
        System.out.println("Queue now: " + q);
        System.out.println("Remove: " + q.remove());
        System.out.println("Final Queue: " + q);
    }
}
