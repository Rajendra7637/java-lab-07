import java.util.PriorityQueue;

public class Q22_PriorityQueueRemoveOrder {
    public static void main(String[] args) {
        System.out.println("=== Q22: Remove Elements from PriorityQueue (Natural Order) ===");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(30);

        System.out.println("Initial PriorityQueue: " + pq);
        System.out.println("Removing elements sequentially via poll():");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println("\nObservation: Elements are removed in strictly ascending natural priority order.");
    }
}
