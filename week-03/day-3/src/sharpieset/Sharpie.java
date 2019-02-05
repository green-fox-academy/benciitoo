package sharpieset;

public class Sharpie {

    String color;
    float width;
    float inkAmount;


    public Sharpie(String color, float inkAmount){
        this.color = color;
        width = 5;
        this.inkAmount = inkAmount;
    }


    public void use(float inkAmountToUse){
        inkAmount -= inkAmountToUse;
    }


}