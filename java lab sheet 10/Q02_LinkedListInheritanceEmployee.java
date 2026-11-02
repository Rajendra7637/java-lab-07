import java.util.LinkedList;

public class Q02_LinkedListInheritanceEmployee {
    // Base class Person
    static class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void display() {
            System.out.print("Name: " + name + " | Age: " + age);
        }
    }

    // Derived class Employee inheriting from Person
    static class Employee extends Person {
        private int empId;
        private String department;
        private double salary;

        public Employee(int empId, String name, int age, String department, double salary) {
            super(name, age);
            this.empId = empId;
            this.department = department;
            this.salary = salary;
        }

        public int getEmpId() {
            return empId;
        }

        @Override
        public void display() {
            System.out.println("EmpID: " + empId + " | Name: " + name + " | Age: " + age 
                + " | Dept: " + department + " | Salary: $" + salary);
        }
    }

    // Manager using LinkedList<Employee>
    private final LinkedList<Employee> employeeRecords = new LinkedList<>();

    public void addEmployee(Employee emp) {
        employeeRecords.add(emp);
        System.out.println("Added Employee: " + emp.getName());
    }

    public void displayEmployees() {
        System.out.println("\n--- Employee Records (LinkedList) ---");
        if (employeeRecords.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Employee emp : employeeRecords) {
            emp.display();
        }
    }

    public void searchByName(String name) {
        System.out.println("\nSearching for employee: '" + name + "'...");
        boolean found = false;
        for (Employee emp : employeeRecords) {
            if (emp.getName().equalsIgnoreCase(name)) {
                System.out.print("Record Found -> ");
                emp.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employee found with name: " + name);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q02: Inheritance with LinkedList<Employee> ===");
        Q02_LinkedListInheritanceEmployee manager = new Q02_LinkedListInheritanceEmployee();

        manager.addEmployee(new Employee(1001, "Rajendra Bisht", 24, "Software Eng", 85000));
        manager.addEmployee(new Employee(1002, "Sneha Rawat", 26, "Data Science", 92000));
        manager.addEmployee(new Employee(1003, "Rohit Mehra", 29, "Cloud Ops", 78000));

        manager.displayEmployees();

        manager.searchByName("Sneha Rawat");
        manager.searchByName("Anil Kumar");
    }
}
