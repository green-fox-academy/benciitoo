package sharpie;

public class SharpieTask {
    public static void main(String[] args) {

        Sharpie sharpie1 = new Sharpie("Yellow", 5);

        sharpie1.use(15.4f);

        System.out.println(sharpie1.inkAmount);
    }
}