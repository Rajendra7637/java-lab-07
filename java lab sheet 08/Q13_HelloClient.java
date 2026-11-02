import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Q13_HelloClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;
        System.out.println("=== Q13: HelloClient connecting to " + host + ":" + port + " ===");
        try (Socket socket = new Socket(host, port);
             OutputStream out = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(out, true)) {

            writer.println("Hello Server");
            System.out.println("Sent message: Hello Server");
        } catch (Exception e) {
            System.out.println("Client Exception: " + e.getMessage());
        }
    }
}
