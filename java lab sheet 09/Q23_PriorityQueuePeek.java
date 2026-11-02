import java.util.PriorityQueue;

public class Q23_PriorityQueuePeek {
    public static void main(String[] args) {
        System.out.println("=== Q23: Peek First Element of PriorityQueue ===");
        PriorityQueue<String> tasks = new PriorityQueue<>();
        tasks.add("Task Medium");
        tasks.add("Task Urgent");
        tasks.add("Task Low");

        System.out.println("All tasks: " + tasks);
        System.out.println("Peek highest priority element: " + tasks.peek());
        System.out.println("Peek again (verifying not removed): " + tasks.peek());
        System.out.println("Size after peeking: " + tasks.size());
    }
}
