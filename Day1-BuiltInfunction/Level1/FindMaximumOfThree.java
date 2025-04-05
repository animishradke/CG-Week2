import java.util.Scanner;

public class FindMaximumOfThree {

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int findMaximum(int num1, int num2, int num3) {
        int maximum = num1;
        if (num2 > maximum) {
            maximum = num2;
        }
        if (num3 > maximum) {
            maximum = num3;
        }
        return maximum;
    }

    public static void main(String[] args) {
        int number1 = getInput("Enter first number: ");
        int number2 = getInput("Enter second number: ");
        int number3 = getInput("Enter third number: ");
        int maximumNumber = findMaximum(number1, number2, number3);
        System.out.println("The maximum of the three numbers is: " + maximumNumber);
    }
}