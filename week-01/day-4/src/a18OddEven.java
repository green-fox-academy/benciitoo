import java.util.Scanner;
public class a18OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.



        System.out.println("Please type in a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 != 0){
            System.out.println("Odd");
        } else {
            System.out.println(("Even"));
        }


    }
}
