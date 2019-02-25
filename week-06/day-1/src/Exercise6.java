public class Exercise6 {

    public static void main(String[] args) {

//Write a Stream Expression to find the uppercase characters in a string!

        String myString = "Find the Uppercase characters, my Dear!";
        myString.chars()
                .mapToObj(x -> (char) x)
                .filter(x -> Character.isUpperCase(x))
                .forEach(System.out::println); //így nem kell hosszan kiírni, és a lambda expression-t is elhagyhatom
    }
}