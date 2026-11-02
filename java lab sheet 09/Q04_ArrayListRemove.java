import java.util.ArrayList;

public class Q04_ArrayListRemove {
    public static void main(String[] args) {
        System.out.println("=== Q04: Remove by Index & by Value ===");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println("Initial list: " + list);

        // Remove by index (index 1 -> removes 200)
        int removedByIndex = list.remove(1);
        System.out.println("Removed by index 1: " + removedByIndex);
        System.out.println("List after removing index 1: " + list);

        // Remove by value (remove 400 using Integer object)
        boolean removedByValue = list.remove(Integer.valueOf(400));
        System.out.println("Removed by value 400? " + removedByValue);
        System.out.println("List after removing value 400: " + list);
    }
}
