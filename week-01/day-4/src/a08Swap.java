public class a08Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("New value of A: " + a);
        System.out.println("New value of B: " + b);
    }
}