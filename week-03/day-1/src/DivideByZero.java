import java.util.Scanner;

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

public class DivideByZero {
    public static void main(String[] args) {

        System.out.println("Please type in a number: ");
        int numberToDivideWidth = typeInNumber();
        divide (numberToDivideWidth);
    }


    public static int typeInNumber () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static void divide (int toDivideWith){
        try {
            int result = 10 / toDivideWith;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("fail");
        }


    }
}
