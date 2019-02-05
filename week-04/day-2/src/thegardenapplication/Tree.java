package thegardenapplication;

public class Tree extends Plant {

    public Tree(String color){
        super(color);
        name = "Tree";
        minWaterlevel = 10;
        waterAbsorbtionCapacity = 0.40;
        //currentWaterLevel-t átveszi automatikusan apuciból
    }
}