import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Q15_EchoServer {
    public static void main(String[] args) {
        int port = 5001;
        System.out.println("=== Q15: TCP Echo Server on port " + port + " ===");

        // Run self-test client in background thread if arg "--demo" is passed or by default when testing
        if (args.length > 0 && args[0].equals("--demo")) {
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                    try (Socket client = new Socket("localhost", port);
                         PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                         BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()))) {

                        String testMsg = "Hello from Echo Client!";
                        System.out.println("[Client] Sending: " + testMsg);
                        out.println(testMsg);
                        String reply = in.readLine();
                        System.out.println("[Client] Echo received back: " + reply);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("EchoServer listening on port " + port + "...");
            try (Socket socket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Server received: " + inputLine);
                    out.println(inputLine); // Echo back
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("EchoServer Exception: " + e.getMessage());
        }
    }
}
