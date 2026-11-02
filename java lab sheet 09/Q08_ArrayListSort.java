import java.util.ArrayList;
import java.util.Collections;

public class Q08_ArrayListSort {
    public static void main(String[] args) {
        System.out.println("=== Q08: Sort ArrayList of Integers (Ascending) ===");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(3);
        numbers.add(67);
        numbers.add(23);

        System.out.println("Unsorted List: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted List  : " + numbers);
    }
}
