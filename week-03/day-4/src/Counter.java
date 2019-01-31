public class Counter {
    public static void main(String[] args) {

        countdown(10);
    }


    static void countdown(int n){
        System.out.println(n);

        if (n <= 0){
            return;
        }
        countdown(n - 1);
    }

}