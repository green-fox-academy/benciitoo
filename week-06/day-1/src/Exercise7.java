import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {

    public static void main(String[] args) {

//Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        returnTheCityWithTheGivenLetter("a", cities);
    }


    public static void returnTheCityWithTheGivenLetter (String letter, List <String> cities){

        List<String> newCities = cities.stream()
                .filter(x -> x.startsWith(letter.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println(newCities.toString());
    }
}