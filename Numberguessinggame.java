import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // 1 to 100
        int attempts = 0;
        boolean guessed = false;

        System.out.println("=========================================");
        System.out.println("        Welcome to Number Guessing!      ");
        System.out.println("=========================================");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Can you guess it?\n");

        while (!guessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("⚠ Please enter a number between 1 and 100.\n");
            } else if (guess < secretNumber) {
                System.out.println("Too Low! Try a higher number.\n");
            } else if (guess > secretNumber) {
                System.out.println("Too High! Try a lower number.\n");
            } else {
                guessed = true;
                System.out.println("-----------------------------------------");
                System.out.println("Correct! The number was: " + secretNumber);
                System.out.println("You guessed it in " + attempts + " attempt(s)!");

                if (attempts == 1) {
                    System.out.println("Amazing — first try!");
                } else if (attempts <= 5) {
                    System.out.println("Great job!");
                } else {
                    System.out.println("Keep practicing to improve!");
                }
                System.out.println("-----------------------------------------");
            }
        }

        scanner.close();
    }
}