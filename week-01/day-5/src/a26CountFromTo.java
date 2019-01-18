import java.util.Scanner;
public class a26CountFromTo {
    public static void main(String[] args) {

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in the first number:");
        int num1 = input.nextInt();
        System.out.println("Please type in the second number:");
        int num2 = input.nextInt();

        if (num2 <= num1) {
            System.out.println("The second number should be bigger");
        } else {
            // for (; num1 < num2; num1++) {
            //    System.out.println(num1);        Így oldottam meg először.
            while (num1 < num2) {
                System.out.println(num1++);
            }
        }

    }
}