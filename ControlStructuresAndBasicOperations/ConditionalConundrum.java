package ControlStructuresAndBasicOperations;

public class ConditionalConundrum {
    public static void main(String[] args) {
        // Declare and initialize an integer variable
        int input = 10;

        // Check if the input is zero
        if (input == 0) {
            // Print a message if the input is zero
            System.out.println("Number is zero");
        }
        // Check if the input is greater than zero
        else if (input > 0) {
            // Print a message if the input is positive
            System.out.println("Number is positive");
        }
        // If the input is not zero and not positive, it must be negative
        else {
            // Print a message if the input is negative
            System.out.println("Number is negative");
        }
    }
}
