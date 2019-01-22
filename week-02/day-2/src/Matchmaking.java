import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...


        System.out.println(makingMatches(girls, boys));
    }


    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {

        ArrayList<String> matched = new ArrayList<String>();
        for (int i = 0; i < boys.size(); i++) {

            if (i < girls.size()) {
                matched.add(girls.get(i));
            }

            if (i < boys.size()) {
                matched.add(boys.get(i));
            }

        }
        return matched;
    }

}