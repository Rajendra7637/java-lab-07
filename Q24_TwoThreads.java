public class Q24_TwoThreads {
    public static void main(String[] args) {
        Thread first = new Thread(() -> System.out.println("Running: " + Thread.currentThread().getName()), "FirstThread");
        Thread second = new Thread(() -> System.out.println("Running: " + Thread.currentThread().getName()), "SecondThread");
        first.start();
        second.start();
    }
}
