public class Bunny1 {
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    public static void main(String[] args) {
        System.out.println(countTheEarsOfBunnies(7));
    }


    static int countTheEarsOfBunnies(int numberOfBunnies){

        if (numberOfBunnies > 0) {
            return (2 + countTheEarsOfBunnies(numberOfBunnies - 1));
        } else {
            return 0;
        }
    }

}