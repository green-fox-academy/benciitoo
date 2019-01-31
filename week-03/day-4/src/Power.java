public class Power {
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    public static void main(String[] args) {

        System.out.println(powerN(3, 6));
    }


    static int powerN(int base, int power){

        if (power > 1) {
            return (base * powerN(base,power - 1));
        } else {
            return base;
        }
    }

}