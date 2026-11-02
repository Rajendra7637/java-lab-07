import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Q14_HelloServerReadMessage {
    public static void main(String[] args) {
        int port = 5000;
        System.out.println("=== Q14: HelloServer (Read Message) on port " + port + " ===");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is waiting for client connection...");
            try (Socket socket = serverSocket.accept();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                System.out.println("Client connected: " + socket.getInetAddress());
                String message = reader.readLine();
                System.out.println("Received from client: " + message);
            }
        } catch (Exception e) {
            System.out.println("Server Exception: " + e.getMessage());
        }
    }
}
