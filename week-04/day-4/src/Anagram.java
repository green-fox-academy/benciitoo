import java.util.Arrays;

public class Anagram {

    public boolean areTheAnagram (String firstString, String secondString){
        char[] firstArray = firstString.toLowerCase().toCharArray();
        char[] secondArray = secondString.toLowerCase().toCharArray();

        if (firstArray.length == secondArray.length) {
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            return (Arrays.equals(firstArray, secondArray));
        }
        return false;
    }
}