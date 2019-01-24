import java.util.*;

public class Candyshop{
    public static void main(String... args){
        ArrayList<Object> lista = new ArrayList<Object>();
        lista.add("Cupcake");
        lista.add(2);
        lista.add("Brownie");
        lista.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(lista));

        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }


    public static ArrayList<Object> sweets (ArrayList<Object> insideList){
        insideList.set(1, "Croissant");
        insideList.set(3, "Ice cream");
        return insideList;
    }
}