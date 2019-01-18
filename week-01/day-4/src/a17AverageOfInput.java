import java.util.Scanner;
public class a17AverageOfInput {
    public static void main(String[] args) {

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

        Scanner input = new Scanner(System.in);

        int [] numberArray = new int[5];
        int sum = 0;

        System.out.println("Please type in " + numberArray.length + " numbers: ");

        for (int i = 0; i < numberArray.length; i++){
            int numbersIn = input.nextInt();
            numberArray[i] = numbersIn;
            sum = sum + numberArray[i];
        }

        double average = (double)sum / numberArray.length;
        System.out.println("Sum: " + sum + ", Average: " + average);



    }
}