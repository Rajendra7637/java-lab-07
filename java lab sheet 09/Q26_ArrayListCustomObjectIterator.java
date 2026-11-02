import java.util.ArrayList;
import java.util.Iterator;

public class Q26_ArrayListCustomObjectIterator {
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
            return "Student[id=" + id + ", name=" + name + ", marks=" + marks + "]";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q26: ArrayList of Custom Objects with Iterator ===");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Rajendra", 91.5));
        students.add(new Student(102, "Amit", 84.0));
        students.add(new Student(103, "Pooja", 89.0));

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println("Iterated: " + s);
        }
    }
}
