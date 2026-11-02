import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class Q18_WebReader {
    public static void main(String[] args) {
        System.out.println("=== Q18: WebReader using URL ===");
        String spec = "http://example.com";
        try {
            URL url = URI.create(spec).toURL();
            System.out.println("Connecting to " + spec + "...");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                int linesPrinted = 0;
                while ((line = reader.readLine()) != null && linesPrinted < 20) {
                    System.out.println(line);
                    linesPrinted++;
                }
                if (reader.readLine() != null) {
                    System.out.println("... [Output truncated for brevity] ...");
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading URL content: " + e.getMessage());
        }
    }
}
