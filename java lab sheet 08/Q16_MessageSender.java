import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Q16_MessageSender {
    public static void main(String[] args) {
        int port = 6000;
        System.out.println("=== Q16: UDP MessageSender ===");
        try (DatagramSocket socket = new DatagramSocket()) {
            String message = "Ping";
            byte[] buffer = message.getBytes();
            InetAddress receiverAddress = InetAddress.getByName("localhost");

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverAddress, port);
            socket.send(packet);
            System.out.println("Sent UDP message '" + message + "' to localhost:" + port);
        } catch (Exception e) {
            System.out.println("Sender Exception: " + e.getMessage());
        }
    }
}
