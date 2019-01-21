// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end


public class A15AppendA {

    public static void main(String[] args) {

        String[] animals = new String[] {"koal", "pand", "zebr"};

        for (int i = 0; i < animals.length; i++) {
            animals[i] = (animals[i]+"a");
        }

    }
}