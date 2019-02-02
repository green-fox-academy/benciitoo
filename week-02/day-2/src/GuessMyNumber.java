import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        System.out.println("You will have to guess the number between two numbers! Please give me these two numbers!");
        System.out.println("First number: ");
        int rangeFrom = typeInNumber();
        System.out.println("Second number: ");
        int rangeTo = typeInNumber();

        while (rangeFrom >= rangeTo) {
            System.out.println("The second number has to be higher than the first number! Please type in the second number again: ");
            rangeTo = typeInNumber();
        }

        System.out.println("Great, now you have to guess the number between " + rangeFrom + " and " + rangeTo + "!");
        int toBeGuessed = rangeFrom + (int)(Math.random() * (rangeTo - rangeFrom + 1));

        int lives = 5;
        boolean guess = false;
        while (!guess && lives > 0) {
            guess = guessNumberGame(toBeGuessed, lives);
            if (!guess) {
                lives--;
            }
        }

        if (guess) {
            System.out.println("Congratulations! You guessed the number!");
        } else {
            System.out.println("You died.");
        }

    }


    public static int typeInNumber () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static boolean guessNumberGame (int toBeGuessed, int lives) {

        boolean actualGuess = false;
        System.out.println("You have " + lives + " lives left!");
        System.out.println("Guess the number: ");
        int toCompare = typeInNumber();
        if (toCompare > toBeGuessed) {
            System.out.println("Too high!");
        } else if (toCompare < toBeGuessed) {
            System.out.println("Too low!");
        } else {
            actualGuess = true;
        }

        return actualGuess;
    }

}

/*
Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a guess.
If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.
Make the range customizable (ask for it before starting the guessing).
You can add lives. (optional)
Example
I've the number between 1-100. You have 5 lives.
20
Too high. You have 4 lives left.
10
Too low. You have 3 lives left.
15
Congratulations. You won!
 */