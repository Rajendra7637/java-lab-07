import java.util.Vector;

public class Q07_VectorEncapsulationCustomer {
    // Encapsulated Customer class with private fields
    static class Customer {
        private int id;
        private String name;
        private String email;

        public Customer(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        // Public getters and setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void display() {
            System.out.println("Customer [ID: " + id + ", Name: " + name + ", Email: " + email + "]");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q07: Vector & Encapsulation with Customer ===");
        Vector<Customer> customers = new Vector<>();

        Customer c1 = new Customer(1, "Rajendra Singh", "rajendra@example.com");
        Customer c2 = new Customer(2, "Manish Rawat", "manish@example.com");
        Customer c3 = new Customer(3, "Sunita Negi", "sunita@example.com");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        System.out.println("--- Customer Details from Vector ---");
        for (Customer c : customers) {
            c.display();
        }

        // Demonstrating setter access (encapsulation)
        System.out.println("\nUpdating Customer 2 email via setter...");
        c2.setEmail("manish.new@example.com");

        System.out.println("Updated Customer 2: " + c2.getName() + " -> " + c2.getEmail());
    }
}
