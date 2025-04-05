import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the guess high, low, or correct? (h/l/c): ");
        return scanner.nextLine().toLowerCase();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guess;
        String feedback;
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it.");
        System.out.println("You can tell me if the guess is high (h), low (l), or correct (c).");
        while (true) {
            guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);
            feedback = getUserFeedback();

            if (feedback.equals("c")) {
                System.out.println("Yay! I guessed your number correctly!");
                break;
            } else if (feedback.equals("h")) {
                high = guess - 1;
            } else if (feedback.equals("l")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}