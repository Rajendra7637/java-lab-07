public class Q29_SynchronizedCounter {
    static int counter = 0;
    static final int THREADS = 5;
    static final int INCREMENTS = 100000;

    static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREADS];
        for (int i = 0; i < THREADS; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS; j++) increment();
            });
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        System.out.println("Expected: " + (THREADS * INCREMENTS));
        System.out.println("Actual with synchronization: " + counter);
    }
}
