package task3;
import java.util.Scanner;
public class DivisionPro {
	public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for the first integer
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Prompt user for the second integer
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;

            // Display the result
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle other potential exceptions
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
	
}
