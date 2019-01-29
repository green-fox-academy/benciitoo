import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {


        System.out.println("You will have to guess the number between two numbers! Please give me these two numbers!");
        System.out.println("First number: ");
        int rangeFrom = typeInNumber();
        System.out.println("Second number: ");
        int rangeTo = typeInNumber();

        while (rangeFrom > rangeTo) {
            System.out.println("The second number has to be higher than the first number! Please type in the second number again: ");
            rangeTo = typeInNumber();
        }

        System.out.println("Great, now you have to guess the number between " + rangeFrom + " and " + rangeTo + "!");
        int toBeGuessed = rangeFrom + (int) (Math.random()) * rangeTo;


        int lives = 5;
        boolean guess = false;

        while ((guess = false) && lives > 0) {
            guess = guessNumberGame(rangeFrom, rangeTo, toBeGuessed, lives, guess);

            if (guess = false) {
                lives--;
            }

        }


        System.out.println("You guessed the number!");


    }

    public static int typeInNumber () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static boolean guessNumberGame (int rangeFrom, int rangeTo, int toBeGuessed, int lives, boolean guess) {

        System.out.println("You have " + lives + " lives left!");
        System.out.println("Guess the number: ");
        int toCompare = typeInNumber();
        if (toCompare > toBeGuessed) {
            System.out.println("Too high!");
        } else if (toCompare < toBeGuessed) {
            System.out.println("Too low!");
        } else {
            guess = true;
        }


        return guess;
    }

}