public class Q09_FinallyReturn {
    static int getValue() {
        try {
            System.out.println("Inside try: preparing return value.");
            return 100;
        } finally {
            System.out.println("Inside finally: this runs before the method returns.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned value: " + getValue());
        System.out.println("Explanation: finally executes before control returns to the caller.");
    }
}
