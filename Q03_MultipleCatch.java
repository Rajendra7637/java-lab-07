import java.util.Scanner;

public class Q03_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int a = Integer.parseInt(sc.next());
            System.out.print("Enter second integer: ");
            int b = Integer.parseInt(sc.next());
            System.out.println("Result: " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            sc.close();
        }
    }
}
