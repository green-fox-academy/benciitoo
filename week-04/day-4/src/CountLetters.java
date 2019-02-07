import java.util.HashMap;

public class CountLetters {


public HashMap countTheLettersInString (String countMe) {
    char[] charArray = countMe.toLowerCase().toCharArray();
    HashMap<Character, Integer> charMap = new HashMap<>();

    for (int i = 0; i < charArray.length; i++) {
        if (charMap.isEmpty() || !charMap.containsKey(charArray[i])) {
            charMap.put(charArray[i], 1);
        } else {
            charMap.put(charArray[i], charMap.get(charArray[i]) + 1);
        }
    }
    return charMap;
    }
}