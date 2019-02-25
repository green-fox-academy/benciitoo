import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Excercise10 {

    public static void main(String[] args) {


        Fox fox1 = new Fox("Foxi Maxi", "yellow", 10);
        Fox fox2 = new Fox("Reddish", "red", 11);
        Fox fox3 = new Fox("Magog", "green", 9);
        Fox fox4 = new Fox("Donatello", "blue", 5);
        Fox fox5 = new Fox("Rafi", "green", 2);
        List<Fox> foxList = Arrays.asList(fox1, fox2, fox3, fox4, fox5);

        System.out.println("Foxes with green color:");
        foxList.stream()
                .filter(x -> x.getColor().equals("green"))
                .forEach(fox -> System.out.println(fox.getName()));

        System.out.println();
        System.out.println("Foxes with green color, and age less then 5 years:");
        foxList.stream()
                .filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5)
                .forEach(fox -> System.out.println(fox.getName()));

        System.out.println();
        System.out.println("Frequency of foxes by color:");
        Map<String, Long> frequencyList = foxList.stream()
                .collect(Collectors.groupingBy(s -> s.getColor(), Collectors.counting()));
        System.out.println(frequencyList.toString());

        System.out.println();
        System.out.println("Frequency of foxes by color:");
        Map<String, List<String>> frequencyList2 = foxList.stream()
                .collect(Collectors.groupingBy(s -> s.getColor(), Collectors.mapping(s -> s.getName(), Collectors.toList())));
        System.out.println(frequencyList2.toString());
    }
}

/*Create a Fox class with 3 properties (name, color, age) Fill a list with at least 5 foxes and:

Write a Stream Expression to find the foxes with green color!
Write a Stream Expression to find the foxes with green color, and age less then 5 years!
Write a Stream Expression to find the frequency of foxes by color! */