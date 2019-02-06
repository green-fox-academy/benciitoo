package comparable;

import java.util.Arrays;

public class Domino implements Comparable<Domino> {

    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }


    @Override
    public int compareTo(Domino d) {

        if (left > d.left) {
            return 1;
        } else if (left == d.left) {
            if (right > d.right) {
                return 1;
            }
        }
        return -1;
    }
}