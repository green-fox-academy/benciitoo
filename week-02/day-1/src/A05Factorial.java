//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial


public class A05Factorial {

    public static void main(String[] args) {

        int inputNumber = 5;

        System.out.println(factorio(inputNumber));
    }


    public static int factorio (int factorMe) {
        int factored = 1;
        for(int i = 1; i <= factorMe; i++){
            factored = factored * i;
        }
        return factored;
    }
}