import java.util.Scanner;
public class a15MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Please type in the distance in kilometers format: ");
        Scanner inkey = new Scanner(System.in);
        int kilometers = inkey.nextInt();

        double miles = kilometers * 0.621371192;

        System.out.println("The distance is: " + miles);




    }
}