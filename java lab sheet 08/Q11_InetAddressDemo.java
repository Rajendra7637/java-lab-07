import java.net.InetAddress;

public class Q11_InetAddressDemo {
    public static void main(String[] args) {
        System.out.println("=== Q11: InetAddress IP & Hostname Demo ===");
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Host Name  : " + localHost.getHostName());
            System.out.println("IP Address : " + localHost.getHostAddress());

            // Example resolving a domain name
            InetAddress domain = InetAddress.getByName("example.com");
            System.out.println("Example.com Host Name  : " + domain.getHostName());
            System.out.println("Example.com IP Address : " + domain.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
