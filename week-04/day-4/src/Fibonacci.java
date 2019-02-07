public class Fibonacci {


    public int fibonacciSequence(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            int num1 = 0, num2 = 1, sum = 0;
            for (int i = 1; i < n; i++) {
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
            return sum;
        }
    }
}