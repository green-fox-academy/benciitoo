// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class A18Reverse {

    public static void main(String[] args) {

        int[] aj = new int[] {3, 4, 5, 6, 7};
        int[] tempArray = new int[aj.length];

        for (int i = 0; i < aj.length; i++) {
            tempArray[i] = aj[aj.length - i - 1];
        }
        aj = tempArray;

        System.out.println(Arrays.toString(aj));

    }
}