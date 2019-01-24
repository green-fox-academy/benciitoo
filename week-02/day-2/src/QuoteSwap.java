import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }


    public static String quoteSwap (ArrayList<String> insideList) {
        Collections.swap(insideList, 2, 5);
        String seged = "";
        for (int i = 0; i < insideList.size(); i++) {
            seged = seged + (insideList.get(i) + " ");
        }
        return seged;
    }


    /*public static String quoteSwap (ArrayList<String> insideList){
        String seged = insideList.get(2);
        insideList.set(2, insideList.get(5));
        insideList.set(5, seged);
        seged = "";
        for (int i = 0; i < insideList.size(); i++) {
            seged = seged + (insideList.get(i) + " ");
        }
        return seged;
    }*/


}