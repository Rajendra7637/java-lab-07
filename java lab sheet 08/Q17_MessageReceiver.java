import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Q17_MessageReceiver {
    public static void main(String[] args) {
        int port = 6000;
        System.out.println("=== Q17: UDP MessageReceiver on port " + port + " ===");
        try (DatagramSocket socket = new DatagramSocket(port)) {
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            System.out.println("Waiting to receive UDP packet...");
            socket.receive(packet);

            String receivedMessage = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + receivedMessage);
            System.out.println("From address: " + packet.getAddress() + ":" + packet.getPort());
        } catch (Exception e) {
            System.out.println("Receiver Exception: " + e.getMessage());
        }
    }
}
