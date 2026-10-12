public class Q04_NestedTry {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int numerator = 100, denominator = 5;
        try {
            System.out.println("Division result: " + (numerator / denominator));
            try {
                int index = 5;
                System.out.println("Array value: " + values[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: invalid array index.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: division by zero.");
        }
    }
}
