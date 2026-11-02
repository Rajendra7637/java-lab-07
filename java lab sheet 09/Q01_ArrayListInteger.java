import java.util.ArrayList;

public class Q01_ArrayListInteger {
    public static void main(String[] args) {
        System.out.println("=== Q01: ArrayList of Integers ===");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("ArrayList elements: " + numbers);
        System.out.print("Printed individually: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
