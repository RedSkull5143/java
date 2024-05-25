package BasicJavaPrograms;

public class ConstructorConnoisseur {

    // Inner class declaration as per the problem statement
    static class Number {
        int a;

        // Constructor to initialize the instance variable
        public Number(int input) {
            this.a = input;
            // Printing the integer directly inside the constructor
            System.out.println("Input is " + a);
        }
    }

    public static void main(String[] args) {
        // Instantiating Number class with an integer argument
        Number number = new Number(10);
    }
}
