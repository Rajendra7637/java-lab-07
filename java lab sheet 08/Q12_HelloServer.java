import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Q12_HelloServer {
    public static void main(String[] args) {
        int port = 5000;
        System.out.println("=== Q12: HelloServer starting on port " + port + " ===");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is waiting for client connection...");
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Client connected");
            }
        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());
        }
    }
}
