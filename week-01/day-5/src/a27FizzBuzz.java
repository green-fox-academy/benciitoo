public class a27FizzBuzz {
    public static void main(String[] args) {

// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

        for (int i = 1; i < 101; i++) {

            boolean canBeDividedByThree = i % 3 == 0;
            boolean canBeDividedByFive = i % 5 == 0;

            if (canBeDividedByFive && canBeDividedByThree) {
                System.out.println("Fizzbuzz");
            } else if (canBeDividedByThree) {
                System.out.println("Fizz");
            } else if (canBeDividedByFive) {
                System.out.println("Buzz");
            } else System.out.println(i);

        }

    }
}