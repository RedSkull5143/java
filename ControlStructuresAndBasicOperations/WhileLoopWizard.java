package ControlStructuresAndBasicOperations;

public class WhileLoopWizard {
    public static void main(String[] args) {
        // Declare an array to store the first 10 Fibonacci numbers
        int[] fibonacci = new int[10];

        // Initialize the first two numbers of the Fibonacci sequence
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Use a while loop to calculate the next 8 Fibonacci numbers
        int i = 2;
        while (i < 10) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }

        // Print the Fibonacci numbers in reverse order
        for (int j = 9; j >= 0; j--) {
            System.out.println(fibonacci[j]);
        }
    }
}
