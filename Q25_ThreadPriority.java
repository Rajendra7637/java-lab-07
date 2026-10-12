public class Q25_ThreadPriority {
    public static void main(String[] args) {
        Thread low = new Thread(() -> printName(), "LowPriority");
        Thread normal = new Thread(() -> printName(), "NormalPriority");
        Thread high = new Thread(() -> printName(), "HighPriority");
        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        low.start();
        normal.start();
        high.start();
        System.out.println("Priorities are hints; execution order is not guaranteed.");
    }

    static void printName() {
        System.out.println(Thread.currentThread().getName() + " priority=" + Thread.currentThread().getPriority());
    }
}
