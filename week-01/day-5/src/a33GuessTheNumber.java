import java.util.Scanner;
public class a33GuessTheNumber {

    public static void main(String[] args) {

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

        int guessMe = 40;
        int userTry = 0;

        System.out.println("Guess the stored number:");

        while (userTry != guessMe) {

            Scanner input = new Scanner(System.in);
            userTry = input.nextInt();

            if (userTry > guessMe) {
                System.out.println("The stored number is lower");
            } else if (userTry < guessMe){
                System.out.println("The stored number is higher");
            }
        }
        System.out.println("You found the number!");
    }
}