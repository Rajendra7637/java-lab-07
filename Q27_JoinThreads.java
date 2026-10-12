public class Q27_JoinThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> {
            for (int i = 1; i <= 3; i++) System.out.println("First thread: " + i);
        });
        Thread second = new Thread(() -> {
            try {
                first.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Second thread starts after first finishes.");
        });
        first.start();
        second.start();
    }
}
