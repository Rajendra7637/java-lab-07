import java.util.HashMap;
import java.util.Map;

public class Q05_HashMapStudentRollNumber {
    // Separate Student class
    static class Student {
        private int rollNo;
        private String name;
        private String branch;

        public Student(int rollNo, String name, String branch) {
            this.rollNo = rollNo;
            this.name = name;
            this.branch = branch;
        }

        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public void display() {
            System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Branch: " + branch);
        }
    }

    private final HashMap<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(int rollNo, Student s) {
        studentMap.put(rollNo, s);
        System.out.println("Added student with Roll No " + rollNo + " (" + s.getName() + ")");
    }

    public void removeStudent(int rollNo) {
        if (studentMap.containsKey(rollNo)) {
            Student removed = studentMap.remove(rollNo);
            System.out.println("Removed student with Roll No " + rollNo + " (" + removed.getName() + ")");
        } else {
            System.out.println("Roll No " + rollNo + " not found to remove.");
        }
    }

    public void displayStudents() {
        System.out.println("\n--- Current Student Records in HashMap ---");
        if (studentMap.isEmpty()) {
            System.out.println("HashMap is empty.");
            return;
        }
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.print("Key [Roll: " + entry.getKey() + "] -> ");
            entry.getValue().display();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q05: HashMap for Key-Value Pairs (Roll No -> Student) ===");
        Q05_HashMapStudentRollNumber registry = new Q05_HashMapStudentRollNumber();

        registry.addStudent(101, new Student(101, "Rajendra", "MCA"));
        registry.addStudent(102, new Student(102, "Deepak", "MCA"));
        registry.addStudent(103, new Student(103, "Meena", "MCA"));
        registry.addStudent(104, new Student(104, "Suresh", "MCA"));

        registry.displayStudents();

        // Remove student
        System.out.println();
        registry.removeStudent(102);

        registry.displayStudents();
    }
}
