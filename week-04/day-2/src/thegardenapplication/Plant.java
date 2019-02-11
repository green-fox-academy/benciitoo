package thegardenapplication;

public class Plant {

    private String name;
    private String color;
    private double currentWaterLevel;
    private double minWaterlevel;
    private double waterAbsorbtionCapacity;


    public Plant (String color, double minWaterlevel, double waterAbsorbtionCapacity){
        this.name = getClass().getSimpleName();
        this.color = color;
        this.currentWaterLevel = 0;
        this.minWaterlevel = minWaterlevel;
        this.waterAbsorbtionCapacity = waterAbsorbtionCapacity;
    }


    public boolean doesItNeedWatering(){
        return (currentWaterLevel < minWaterlevel);
    }


    public void plantStatus(){
        String doesItNeedWater = doesItNeedWatering() ? " needs water." : " doesn't need water.";
        System.out.println("The " + color + " " + name + doesItNeedWater);
    }


    public void watering(int numberOfPlantsThatNeedWatering, double amountOfWater){
        currentWaterLevel += ((amountOfWater / numberOfPlantsThatNeedWatering) * waterAbsorbtionCapacity);
    }
}