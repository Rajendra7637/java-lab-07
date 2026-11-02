import java.util.ArrayList;
import java.util.Iterator;

public class Q07_ArrayListIterator {
    public static void main(String[] args) {
        System.out.println("=== Q07: Iterate ArrayList Using Iterator ===");
        ArrayList<Double> marks = new ArrayList<>();
        marks.add(85.5);
        marks.add(92.0);
        marks.add(78.5);
        marks.add(96.0);

        Iterator<Double> it = marks.iterator();
        System.out.println("Marks list via Iterator:");
        while (it.hasNext()) {
            Double mark = it.next();
            System.out.println("Mark: " + mark);
        }
    }
}
