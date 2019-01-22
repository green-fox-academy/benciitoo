import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        // The output should be: "boa", "anaconda", "koala", "panda", "zebra"

        System.out.println(appendA(far));
    }


    public static List<String> appendA(List<String> far) {
        String seged = "";
        for (int i = 0; i < far.size(); i++) {
            seged = far.get(i);
            seged = seged + "a";
            far.set(i, seged);
        }
      return far;
    }

}

/* Másik megoldás
        for ( int i=0; i<far.size(); i++){
           far.set(i, far.get(i) + "a");
       }
 */