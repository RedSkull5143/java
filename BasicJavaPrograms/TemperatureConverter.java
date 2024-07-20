package BasicJavaPrograms;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Declare and initialize the temperature in Celsius
        double celsius = 24;

        // Convert the temperature to Fahrenheit using the formula
        // Fahrenheit = (Celsius * 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit is " + fahrenheit);
    }
}
