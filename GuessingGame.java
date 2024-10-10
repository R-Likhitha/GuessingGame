import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        while (numberOfTries < 6 && win == false) {
            System.out.println("Guess a number between 0 and 100:");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            }
        }
        if (win) {
            System.out.println("You win!");
            System.out.println("The number was " + numberToGuess);
            System.out.println("It took you " + numberOfTries + " tries");
        } else {
            System.out.println("You lose!");
            System.out.println("The number was " + numberToGuess);
        }
    }
}
