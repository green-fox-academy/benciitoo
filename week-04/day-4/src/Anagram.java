import java.util.Arrays;

public class Anagram {

    public boolean areTheAnagram (String first, String second){
        char[] firstArray = first.toLowerCase().toCharArray();
        char[] secondArray = second.toLowerCase().toCharArray();

        if (firstArray.length == secondArray.length) {
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            return (Arrays.equals(firstArray, secondArray));
        }
        return false;
    }
}