package task3;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) {
        // Specify the file path
        String filePath = "path/to/your/file.txt";

        // Use try-with-resources to ensure proper resource management
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("Error: The file does not exist.");
        } catch (IOException e) {
            // Handle other I/O exceptions (e.g., issues while reading the file)
            System.out.println("Error: An I/O error occurred while reading the file.");
        }
    }
}
