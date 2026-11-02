import java.util.ArrayList;

public class Q01_ArrayListStudent {
    // Student class with constructor and display() method
    static class Student {
        private int rollNo;
        private String name;
        private String course;

        public Student(int rollNo, String name, String course) {
            this.rollNo = rollNo;
            this.name = name;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public void display() {
            System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Course: " + course);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q01: Student Management using ArrayList ===");
        ArrayList<Student> studentList = new ArrayList<>();

        // Adding student elements
        Student s1 = new Student(101, "Rajendra Singh", "MCA");
        Student s2 = new Student(102, "Amit Sharma", "MCA");
        Student s3 = new Student(103, "Pooja Verma", "MCA");
        Student s4 = new Student(104, "Vikas Gupta", "MCA");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println("--- All Students in ArrayList ---");
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).display();
        }

        // Removing a student by index
        System.out.println("\nRemoving student at index 1 (" + studentList.get(1).getName() + ")...");
        studentList.remove(1);

        // Iterating and displaying after removal
        System.out.println("--- Student List After Removal ---");
        for (Student s : studentList) {
            s.display();
        }
    }
}
