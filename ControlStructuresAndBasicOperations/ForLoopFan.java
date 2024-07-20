package ControlStructuresAndBasicOperations;

public class ForLoopFan {
    public static void main(String[] args) {
        int count = 0; // To count the number of prime numbers found
        int num = 2; // Starting number to check for prime

        // Loop until we find 10 prime numbers
        while (count < 10) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
