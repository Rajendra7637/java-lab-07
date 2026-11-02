import java.util.HashSet;
import java.util.Iterator;

public class Q16_HashSetIterator {
    public static void main(String[] args) {
        System.out.println("=== Q16: Iterate HashSet Using Iterator ===");
        HashSet<String> animals = new HashSet<>();
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Lion");
        animals.add("Leopard");

        Iterator<String> it = animals.iterator();
        System.out.println("HashSet elements via Iterator:");
        while (it.hasNext()) {
            System.out.println("Animal: " + it.next());
        }
    }
}
