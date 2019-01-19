import java.util.Scanner;
public class a29DrawPyramid {
    public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in a number:");
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {

            //  for  (int k = height; k > (i + 1); k--) {
            //      System.out.print(" ");
            //  }         ÍGY CSINÁLTAM ELŐSZÖR

            for  (int k = 0; k < (height - i - 1); k++) {
                System.out.print(" ");
            }


            for  (int j = 0; j < (i + 1 + i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}