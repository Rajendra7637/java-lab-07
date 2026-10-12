import java.util.Scanner;

public class Q08_ThrowsNumber {
    static int readNumber(Scanner sc) throws NumberFormatException {
        System.out.print("Enter an integer: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Number: " + readNumber(sc));
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer entered.");
        } finally {
            sc.close();
        }
    }
}
