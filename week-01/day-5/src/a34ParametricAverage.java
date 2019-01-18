import java.util.Scanner;
public class a34ParametricAverage {

        public static void main(String[] args) {

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

        Scanner input = new Scanner(System.in);

        System.out.println("Please give the number of integers you would like to type in: ");
        int arrayLength = input.nextInt();

        int[] numberArray = new int[arrayLength];
        int sum = 0;

        System.out.println("Please type in " + numberArray.length + " numbers: ");

        for (int i = 0; i < numberArray.length; i++){
            int numbersIn = input.nextInt();
            numberArray[i] = numbersIn;
            sum = sum + numberArray[i];
        }

        double average = (double)sum / numberArray.length;
        System.out.println("Sum: " + sum + ", Average: " + average);

        /*
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            int numbersIn = input.nextInt();
            sum = sum + numbersIn;
        }
        */

    }
}
