import java.util.Scanner;
public class a30DrawDiamond {
    public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in a number:");
        int lines = input.nextInt();
        int half = lines / 2;

        System.out.println();

        for (int i = 0; i < lines - half; i++) {

            for  (int k = 0; k < (lines - half - i - 1); k++) {
                System.out.print(" ");
            }

            for  (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        boolean Even = (lines % 2 == 0);
        int t;

        for (int i = 0; i < half; i++) {

            if (Even) {
                t = i;
            } else {
                t = i + 1;
            }

            for (int k = 0; k < t; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * half - 1 - i * 2; j++) {
                System.out.print("*");
            }


            System.out.println();
        }

    }
}