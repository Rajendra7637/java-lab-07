import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Q03_EmployeeBean {
    public static void main(String[] args) {
        System.out.println("=== Q03: EmployeeBean Serialization Demo ===");
        EmployeeBean emp = new EmployeeBean(201, "Alice Smith", 75000.0);
        String filename = "employee.ser";

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(emp);
            System.out.println("Serialized object saved to " + filename);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            EmployeeBean deserializedEmp = (EmployeeBean) in.readObject();
            System.out.println("Deserialized Employee: " + deserializedEmp);
            System.out.println("Name from deserialized bean: " + deserializedEmp.getEmpName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
