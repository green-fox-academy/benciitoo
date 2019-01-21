// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

public class A01Doubling {

    public static int doubling (int doubleMe) {
        doubleMe = doubleMe * 2;
        return doubleMe;
    }


    public static void main(String[] args) {

        int baseNum = 123;

        System.out.println(doubling(baseNum));
    }
}