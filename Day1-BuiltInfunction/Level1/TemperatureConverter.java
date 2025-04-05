import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsiusTemperature = scanner.nextDouble();
            double fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);
            System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheitTemperature = scanner.nextDouble();
            double celsiusTemperature = fahrenheitToCelsius(fahrenheitTemperature);
            System.out.println("Temperature in Celsius: " + celsiusTemperature);
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}