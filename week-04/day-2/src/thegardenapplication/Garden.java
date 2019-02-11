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


    public void wateringTheGarden(double amountOfWater){
        int numberOfPlantsThatNeedWatering = 0;
        for (Plant plant : listOfPlants) {
            if(plant.doesItNeedWatering()) {
                numberOfPlantsThatNeedWatering++;
            }
        }
        for (Plant plant : listOfPlants) {
            if(plant.doesItNeedWatering()) {
                plant.watering(numberOfPlantsThatNeedWatering, amountOfWater);
            }
        }
    }


    public void reportGardenStatus(){
        for (Plant plant : listOfPlants) {
            plant.plantStatus();
        }
    }
}