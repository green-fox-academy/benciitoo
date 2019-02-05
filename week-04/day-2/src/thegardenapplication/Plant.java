package thegardenapplication;

public class Plant {

    String name;
    String color;
    double currentWaterLevel;
    double minWaterlevel;
    double waterAbsorbtionCapacity;


    public Plant (String color){
        this.color = color;
        this.currentWaterLevel = 0;
    }


    public boolean doesItNeedWatering(){
        return (currentWaterLevel < minWaterlevel);
    }
}