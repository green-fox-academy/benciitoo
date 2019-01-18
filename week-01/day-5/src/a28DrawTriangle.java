import java.util.Scanner;
public class a28DrawTriangle {
    public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in a number:");
        int triangleHeight = input.nextInt();

        for (int i = 0; i < triangleHeight; i++) {
                for  (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}