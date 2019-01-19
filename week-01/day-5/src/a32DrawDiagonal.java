import java.util.Scanner;
public class a32DrawDiagonal {
    public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

        System.out.println("Please give the size of the square");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        System.out.println();

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < lines; j++) {

                if ((i == 0) | (i == lines - 1)) {
                    System.out.print("%");
                } else if ((j == 0) | (j == lines - 1) | (i == j)) {
                    System.out.print("%");
                } else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}