import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {

    public static void main(String[] args) {

//Write a Stream Expression to find the frequency of characters in a given string!

        String myString = "Find the frequency of the characters in this sentence!";

        Map<Character, Long> frequencyMap = myString.chars()
                .mapToObj(x -> (char) x)
                .filter(x -> !x.equals(' '))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(frequencyMap.toString());
    }
}