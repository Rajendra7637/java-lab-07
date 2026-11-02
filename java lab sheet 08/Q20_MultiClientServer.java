import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Q20_MultiClientServer {
    public static void main(String[] args) {
        int port = 5005;
        System.out.println("=== Q20: MultiClientServer on port " + port + " ===");

        // Background simulation for demonstration
        new Thread(() -> {
            try {
                Thread.sleep(800);
                for (int i = 1; i <= 3; i++) {
                    final int id = i;
                    new Thread(() -> {
                        try (Socket s = new Socket("localhost", port);
                             PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
                            out.println("Greeting from Client #" + id);
                            in.readLine();
                        } catch (Exception ignored) {}
                    }, "SimulatedClientThread-" + id).start();
                    Thread.sleep(200);
                }
            } catch (Exception ignored) {}
        }).start();

        int clientCount = 0;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("MultiClientServer listening for incoming connections...");
            while (clientCount < 3) {
                Socket socket = serverSocket.accept();
                clientCount++;
                new Thread(new ClientHandler(socket), "ServerClientWorker-" + clientCount).start();
            }
            Thread.sleep(1500);
            System.out.println("MultiClientServer demo completed for 3 clients.");
        } catch (Exception e) {
            System.out.println("Server Exception: " + e.getMessage());
        }
    }

    static class ClientHandler implements Runnable {
        private final Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String message = in.readLine();
                System.out.println("[" + threadName + "] Message received: " + message);
                out.println("ACK from " + threadName);
            } catch (Exception e) {
                System.out.println("[" + threadName + "] Error: " + e.getMessage());
            } finally {
                try { socket.close(); } catch (Exception ignored) {}
            }
        }
    }
}
