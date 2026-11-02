import java.util.LinkedList;
import java.util.Queue;

public class Q09_QueueLinkedListPatientFIFO {
    // Custom Patient class
    static class Patient {
        private int id;
        private String name;

        public Patient(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Patient [ID=" + id + ", Name=" + name + "]";
        }
    }

    // Queue interface with LinkedList implementation
    private final Queue<Patient> patientQueue = new LinkedList<>();

    public void addPatient(Patient p) {
        patientQueue.offer(p);
        System.out.println("Registered patient: " + p);
    }

    public void servePatient() {
        Patient served = patientQueue.poll();
        if (served != null) {
            System.out.println("Served (FIFO doctor consultation): " + served);
        } else {
            System.out.println("No patients waiting in queue.");
        }
    }

    public void displayQueue() {
        System.out.println("\n--- Waiting Patients in Queue (FIFO) ---");
        if (patientQueue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int token = 1;
        for (Patient p : patientQueue) {
            System.out.println("Token #" + token + ": " + p);
            token++;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q09: Queue Interface with LinkedList (Patient FIFO) ===");
        Q09_QueueLinkedListPatientFIFO clinic = new Q09_QueueLinkedListPatientFIFO();

        clinic.addPatient(new Patient(1, "Rohan Joshi"));
        clinic.addPatient(new Patient(2, "Sunita Sen"));
        clinic.addPatient(new Patient(3, "Farhan Khan"));
        clinic.addPatient(new Patient(4, "Deepa Rana"));

        clinic.displayQueue();

        System.out.println("\nDoctor is ready to consult patients:");
        clinic.servePatient();
        clinic.servePatient();

        clinic.displayQueue();
    }
}
