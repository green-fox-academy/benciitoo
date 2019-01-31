public class Bunny2 {
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    public static void main(String[] args) {
        System.out.println(countTheEarsOfBunnies(10));
    }


    static int countTheEarsOfBunnies(int numberOfBunnies){
        if (numberOfBunnies <= 0){
            return 0;
        } else if (numberOfBunnies % 2 == 1) {
            return (2 + countTheEarsOfBunnies((numberOfBunnies) - 1));
        } else {
            return (3 + countTheEarsOfBunnies((numberOfBunnies) - 1));
        }
    }

}