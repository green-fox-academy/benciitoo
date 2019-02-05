package thegardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> listOfPlants;


    public Garden() {
        this.listOfPlants = new ArrayList<>();
    }


    public void addPlant(Plant plant) {
        listOfPlants.add(plant);
    }


    public void watering(double amountOfWater){
        int counter = 0;
        for (Plant plant : listOfPlants) {
            if(plant.doesItNeedWatering()) {
                counter++;
            }
        }
        for (Plant plant : listOfPlants) {
            if(plant.doesItNeedWatering()) {
                plant.currentWaterLevel += ((amountOfWater / counter) * plant.waterAbsorbtionCapacity);
            }
        }
    }


    public void reportGardenStatus(){

        for (Plant plant : listOfPlants) {
            String doesItNeedWater = plant.doesItNeedWatering() ? " needs water." : " doesn't need water.";
            System.out.println("The " + plant.color + " " + plant.name + doesItNeedWater);
        }
    }
}