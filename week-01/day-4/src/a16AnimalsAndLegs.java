import java.util.Scanner;
public class a16AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have


        System.out.println("Please type in the number of chickens you own: ");
        Scanner inanimal = new Scanner(System.in);
        int chickens = inanimal.nextInt();

        System.out.println("Please type in the number of pigs you own: ");
        int pigs = inanimal.nextInt();

        System.out.println("Your animals have " + (chickens * 2 + pigs * 4) + " legs altogether.");


    }
}