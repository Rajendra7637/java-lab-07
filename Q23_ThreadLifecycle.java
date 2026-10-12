public class Q23_ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("State after creation (New): " + t.getState());
        t.start();
        System.out.println("State after start (usually Runnable): " + t.getState());
        Thread.sleep(50);
        System.out.println("State while sleeping (Timed Waiting): " + t.getState());
        t.join();
        System.out.println("State after completion (Terminated): " + t.getState());
        System.out.println("Note: Running is scheduled from Runnable; exact observations are timing-dependent.");
        System.out.println("Blocked occurs when waiting to enter a synchronized block held by another thread.");
    }
}
