import java.util.Scanner;

public class BasicCalculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Choose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        int choice = scanner.nextInt();
        double calculationResult = 0;
        switch (choice) {
            case 1:
                calculationResult = add(number1, number2);
                System.out.println("Result: " + calculationResult);
                break;
            case 2:
                calculationResult = subtract(number1, number2);
                System.out.println("Result: " + calculationResult);
                break;
            case 3:
                calculationResult = multiply(number1, number2);
                System.out.println("Result: " + calculationResult);
                break;
            case 4:
                calculationResult = divide(number1, number2);
                System.out.println("Result: " + calculationResult);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}