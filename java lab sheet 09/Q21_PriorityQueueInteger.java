import java.util.PriorityQueue;

public class Q21_PriorityQueueInteger {
    public static void main(String[] args) {
        System.out.println("=== Q21: PriorityQueue of Integers ===");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(20);

        System.out.println("PriorityQueue internal array layout: " + pq);
        System.out.println("Head element (lowest): " + pq.peek());
    }
}
