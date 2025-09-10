// . Try-with-Resources

// // 👉 Open a file using try-with-resources (Java 7+) and show that the file closes automatically without finally.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        // Try-with-resources block — file will be closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // No need to call reader.close() — it’s automatic
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        System.out.println("File is automatically closed after try block.");
    }
}
