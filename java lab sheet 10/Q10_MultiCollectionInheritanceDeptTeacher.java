import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Q10_MultiCollectionInheritanceDeptTeacher {
    // Base class Department
    static class Department {
        protected int deptId;
        protected String deptName;

        public Department(int deptId, String deptName) {
            this.deptId = deptId;
            this.deptName = deptName;
        }

        public int getDeptId() {
            return deptId;
        }

        public String getDeptName() {
            return deptName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Department that = (Department) o;
            return deptId == that.deptId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(deptId);
        }

        @Override
        public String toString() {
            return deptName + " (DeptID: " + deptId + ")";
        }
    }

    // Subclass Teacher inheriting from Department
    static class Teacher extends Department {
        private int teacherId;
        private String teacherName;
        private String subject;

        public Teacher(int deptId, String deptName, int teacherId, String teacherName, String subject) {
            super(deptId, deptName);
            this.teacherId = teacherId;
            this.teacherName = teacherName;
            this.subject = subject;
        }

        public int getTeacherId() {
            return teacherId;
        }

        public String getTeacherName() {
            return teacherName;
        }

        public String getSubject() {
            return subject;
        }

        public void display() {
            System.out.println("    Teacher ID: " + teacherId + " | Name: " + teacherName + " | Subject: " + subject);
        }
    }

    // Store departments in an ArrayList
    private final ArrayList<Department> departments = new ArrayList<>();
    // Store teachers in a HashMap<Department, List<Teacher>>
    private final HashMap<Department, List<Teacher>> departmentTeachersMap = new HashMap<>();

    public void addDepartment(Department dept) {
        if (!departments.contains(dept)) {
            departments.add(dept);
            departmentTeachersMap.putIfAbsent(dept, new ArrayList<>());
        }
    }

    public void addTeacher(Department dept, Teacher teacher) {
        addDepartment(dept);
        departmentTeachersMap.get(dept).add(teacher);
        System.out.println("Assigned Teacher '" + teacher.getTeacherName() + "' to " + dept.getDeptName());
    }

    public void displayAll() {
        System.out.println("\n=======================================================");
        System.out.println("  DEPARTMENTS & TEACHERS DIRECTORY (Combined Collections)");
        System.out.println("=======================================================");
        for (Department dept : departments) {
            System.out.println("Department: " + dept);
            List<Teacher> teachers = departmentTeachersMap.get(dept);
            if (teachers == null || teachers.isEmpty()) {
                System.out.println("    (No teachers assigned)");
            } else {
                for (Teacher t : teachers) {
                    t.display();
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q10: Multiple Collections with Inheritance ===");
        Q10_MultiCollectionInheritanceDeptTeacher system = new Q10_MultiCollectionInheritanceDeptTeacher();

        Department csDept = new Department(10, "Computer Science & Engineering");
        Department itDept = new Department(20, "Information Technology");
        Department mgmtDept = new Department(30, "Management Studies");

        system.addTeacher(csDept, new Teacher(10, "CSE", 501, "Dr. Arvind Sharma", "Data Structures & Java"));
        system.addTeacher(csDept, new Teacher(10, "CSE", 502, "Prof. Neha Gupta", "Machine Learning"));
        system.addTeacher(itDept, new Teacher(20, "IT", 503, "Dr. Rajesh Chauhan", "Cloud Computing & Networks"));
        system.addTeacher(mgmtDept, new Teacher(30, "Management", 504, "Prof. Sunita Roy", "Business Analytics"));

        system.displayAll();
    }
}
