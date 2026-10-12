class Q21_MessageThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message " + i + " from " + getName());
        }
    }
}

public class Q21_ExtendThread {
    public static void main(String[] args) {
        new Q21_MessageThread().start();
    }
}
