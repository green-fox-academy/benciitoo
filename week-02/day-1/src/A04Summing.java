//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

public class A04Summing {

    public static int sum (int giveMeArray[]) {
        int summa = 0;
       // for (int i = 0; i < giveMeArray.length; i++) {
       //     summa = summa + giveMeArray[i];
       //}

        for (int barmi:giveMeArray) {
            summa = summa + barmi;
        }
        return summa;
    }


    public static void main(String[] args) {

        int[] numberArray = new int[3];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.random() * 10);
        }
        System.out.println(sum(numberArray));
    }
}