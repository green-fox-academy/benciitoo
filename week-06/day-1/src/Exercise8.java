import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {

        //Write a Stream Expression to concatenate a Character list to a string!

        List<Character> charList = Arrays.asList('a', 'p', 'i', 'c', 's', 'a', 'b', 'a');

        String newString = charList.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining());
        System.out.println(newString);
    }
}