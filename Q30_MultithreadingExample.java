public class Q30_MultithreadingExample {
    public static void main(String[] args) throws InterruptedException {
        Thread printing = new Thread(() -> {
            for (int i = 1; i <= 5; i++) System.out.println("Printer thread: printing page " + i);
        }, "Printer");

        Thread processing = new Thread(() -> {
            for (int i = 1; i <= 5; i++) System.out.println("Processing thread: processing record " + i);
        }, "Processor");

        printing.start();
        processing.start();
        printing.join();
        processing.join();
        System.out.println("Both tasks completed.");
    }
}
