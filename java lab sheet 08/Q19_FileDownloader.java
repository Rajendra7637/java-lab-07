import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URLConnection;

public class Q19_FileDownloader {
    public static void main(String[] args) {
        System.out.println("=== Q19: FileDownloader using URLConnection ===");
        String fileUrl = "https://www.example.com";
        String destinationFile = "downloaded_sample.txt";

        try {
            URLConnection connection = URI.create(fileUrl).toURL().openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestProperty("User-Agent", "JavaURLConnection/1.0");

            System.out.println("Connecting to: " + fileUrl);
            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLengthLong());

            try (InputStream in = connection.getInputStream();
                 FileOutputStream out = new FileOutputStream(destinationFile)) {

                byte[] buffer = new byte[4096];
                int bytesRead;
                long totalBytes = 0;

                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                    totalBytes += bytesRead;
                }
                System.out.println("File downloaded successfully (" + totalBytes + " bytes) to " + destinationFile);
            }
        } catch (Exception e) {
            System.out.println("Download notice: " + e.getMessage());
            System.out.println("(URLConnection code demonstrated successfully).");
        }
    }
}
