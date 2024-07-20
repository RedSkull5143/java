package BasicJavaPrograms;

public class MethodMaestro {

    // Inner class to perform the square operation
    static class Square {
        // Method to return the square of the input integer
        public int squareOfInput(int input) {
            return input * input;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the inner class
        Square s = new Square();

        // Call the method and store the result
        int result = s.squareOfInput(10);

        // Print the result
        System.out.println("Square of input is " + result);
    }
}
