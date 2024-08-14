package task3;

public class Arrayindex {
	public static void main(String[] args) {
        // Create an array of 5 elements
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an index that is out of bounds
  System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Error: Array index is out of bounds.");
        }
    }

}
