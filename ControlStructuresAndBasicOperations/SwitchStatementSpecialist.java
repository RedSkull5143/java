package ControlStructuresAndBasicOperations;

public class SwitchStatementSpecialist {
    public static void main(String[] args) {
        // Declare and initialize an integer variable
        int choice = 7;

        // Use a switch statement to handle different cases based on the value of choice
        switch (choice) {
            // Case when choice is 1
            case 1:
                System.out.println("The number is 1");
                break;

            // Case when choice is 2
            case 2:
                System.out.println("The number is 2");
                break;

            // Case when choice is 3
            case 3:
                System.out.println("The number is 3");
                break;

            // Default case when choice does not match any above cases
            default:
                System.out.println("Number is not recognized");
        }
    }
}
