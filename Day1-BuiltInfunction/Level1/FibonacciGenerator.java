import java.util.Scanner;

public class FibonacciGenerator {

    public static void generateFibonacci(int numberOfTerms) {
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= numberOfTerms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int numTerms = scanner.nextInt();
        if (numTerms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            generateFibonacci(numTerms);
        }
        scanner.close();
    }
}