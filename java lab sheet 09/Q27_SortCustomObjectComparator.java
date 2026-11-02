import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q27_SortCustomObjectComparator {
    static class Student {
        int id;
        String name;
        double marks;

        Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return String.format("Student(ID: %d, Name: %-10s, Marks: %.1f)", id, name, marks);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q27: Sort Custom Objects Using Comparator ===");
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(104, "Karan", 76.5));
        list.add(new Student(101, "Rajendra", 94.0));
        list.add(new Student(103, "Anjali", 88.5));
        list.add(new Student(102, "Bhavna", 82.0));

        System.out.println("--- Original List ---");
        list.forEach(System.out::println);

        // Sort by Marks descending
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.marks, s1.marks);
            }
        });
        System.out.println("\n--- Sorted by Marks (High to Low) ---");
        list.forEach(System.out::println);

        // Sort by Name ascending
        Collections.sort(list, Comparator.comparing(s -> s.name));
        System.out.println("\n--- Sorted by Name (Alphabetical) ---");
        list.forEach(System.out::println);
    }
}
