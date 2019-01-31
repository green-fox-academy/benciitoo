public class Refactorio {
// Create a recursive function called `refactorio`
// that returns it's input's factorial

    public static void main(String[] args) {

        System.out.println(refactorio(6));
    }


    static int refactorio(int number){

        if (number <= 1){
            return number;
        } else {
            return (number * (refactorio(number -1)));
        }
    }

}
