package task3;
import java.util.Scanner;
public class agestest {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // InvalidAgeException ag = new InvalidAgeException();
        
        try {
            // Prompt the user to enter their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if the age is less than 18 and throw the custom exception if true
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            }

            // If no exception, print a success message
            System.out.println("You have entered a valid age.");
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle other potential exceptions, such as input mismatch
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
	
}
