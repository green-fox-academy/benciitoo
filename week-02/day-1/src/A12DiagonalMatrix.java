// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
import java.util.Arrays;
public class A12DiagonalMatrix {

    public static void main(String[] args) {

        int n = 4;
        int[][] twoDimArray = new int[n][n];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i == j) {
                    twoDimArray[i][j] = 1;
                } else {
                    twoDimArray[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }

    }
}