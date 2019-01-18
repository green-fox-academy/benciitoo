import java.util.Scanner;
public class a14HelloUser {
    public static void main(String[] args)

    {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        System.out.println("Type your name in");
        Scanner input = new Scanner(System.in);
        String yourName = input.nextLine();


        System.out.println("Hello " + yourName + "!");
    }
}