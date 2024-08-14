package task3;

import task3.loginpro.IncorrectPasswordException;

public class logintest {
	private static final String CORRECT_PASSWORD = "securePassword123";

    // Method to validate password
    public static void validatePassword(String inputPassword) throws IncorrectPasswordException {
       
    	if (!CORRECT_PASSWORD.equals(inputPassword)) {
            throw new IncorrectPasswordException("The password you entered is incorrect.");
        }
    }

    // Main method to run the login process
    public static void main(String[] args) {
        // Simulate user input (in a real application, use Scanner or GUI for input)
        String userInputPassword = "wrongPassword"; // Example incorrect password

        try {
            // Validate the password
            validatePassword(userInputPassword);
            System.out.println("Login successful!");
        } catch (IncorrectPasswordException e) {
            // Handle the incorrect password scenario
            System.out.println(e.getMessage());
        }
    }
}
