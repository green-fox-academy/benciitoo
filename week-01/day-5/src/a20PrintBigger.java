import java.util.Scanner;
public class a20PrintBigger {
    public static void main(String[] args) {

// Write a program that asks for two numbers and prints the bigger one

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in two numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println("The two numbers are equal.");
        } else if (number1 > number2) {
            System.out.println("The bigger number is: " + number1);
        } else {
            System.out.println("The bigger number is: " + number2);
        }


    }
}


