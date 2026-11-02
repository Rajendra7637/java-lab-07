import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q29_SetToListIteration {
    public static void main(String[] args) {
        System.out.println("=== Q29: Convert Set to List & Iterate ===");
        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);

        System.out.println("Original Set: " + primeNumbers);

        List<Integer> list = new ArrayList<>(primeNumbers);
        System.out.println("Converted List: " + list);

        System.out.println("Iterating by index in List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}
