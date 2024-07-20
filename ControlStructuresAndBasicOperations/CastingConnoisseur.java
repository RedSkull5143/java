package ControlStructuresAndBasicOperations;

public class CastingConnoisseur {
    public static void main(String[] args) {
        // Declare and initialize a double variable
        double a = 10.2;

        // Declare and initialize an integer variable
        int b = 15;

        // Cast the double variable to an integer
        int parsed_a = (int) a;

        // Cast the integer variable to a double
        double parsed_b = (double) b;

        // Print the original double value
        System.out.println(a);

        // Print the casted integer value
        System.out.println(parsed_a);

        // Print the original integer value
        System.out.println(b);

        // Print the casted double value
        System.out.println(parsed_b);
    }
}
