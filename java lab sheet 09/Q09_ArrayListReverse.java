import java.util.ArrayList;
import java.util.Collections;

public class Q09_ArrayListReverse {
    public static void main(String[] args) {
        System.out.println("=== Q09: Reverse an ArrayList of Strings ===");
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        System.out.println("Original List: " + days);
        Collections.reverse(days);
        System.out.println("Reversed List: " + days);
    }
}
