package sharpieset;
import java.util.ArrayList;

public class SharpieSet {

    ArrayList<Sharpie> sharpies;


    public SharpieSet(){
        sharpies = new ArrayList<>();
    }


    public int countUsable(){
        int usable = 0;
        for (Sharpie eachSharpie : sharpies ) {        //Kell-e ide this. a sharpies elé?
            if (eachSharpie.inkAmount != 0) {
                usable++;
            }
        }
        return usable;
    }


    public void removeTrash(){
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(i);
            }
        }
    }


}