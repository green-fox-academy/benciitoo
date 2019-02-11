package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private int ammoStorage;
    private int healthPoint;
    private List<Aircraft> aircraftList;

    public Carrier(int ammo, int healthPoint) {
        this.ammoStorage = ammo;
        this.healthPoint = healthPoint;
        this.aircraftList = new ArrayList<>();
    }


    public void add(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }


    public void fill() {
        if (ammoStorage <= 0) {
            throw new IllegalArgumentException("There's no ammo to refill the Aircrafts!");
        } else {
            int sumTotalAmmoNeedOfTheAircrafts = 0;
            for (Aircraft aircraft : aircraftList) {
                sumTotalAmmoNeedOfTheAircrafts += aircraft.getAmountOfAmmoThatCouldBeRefilled();
            }
            if (sumTotalAmmoNeedOfTheAircrafts <= ammoStorage) {
                for (Aircraft aircraft : aircraftList) {
                    ammoStorage = aircraft.refill(ammoStorage);
                }
            } else {
                priorityBasedFill(true);
                priorityBasedFill(false);
            }
        }
    }


    public void priorityBasedFill(boolean isItPriority) {
        for (int i = 0; i < aircraftList.size(); i++) {
            if (ammoStorage == 0) {
                break;
            }
            if (aircraftList.get(i).isPriority() == isItPriority) {
                ammoStorage = aircraftList.get(i).refill(ammoStorage);
            }
        }
    }


    public void getStatus() {
        System.out.println("HP: " + healthPoint + ", Aircraft count: " + aircraftList.size() + ", Ammo storage: "
                + ammoStorage + ", Total damage: " + getTotalDamage());
    }


    public int getTotalDamage() {
        int totalDamage = 0;
        if (aircraftList.size() > 0) {
            for (Aircraft aircraft : aircraftList) {
                totalDamage += aircraft.fight();
            }
            return totalDamage;
        }
        return totalDamage;
    }

}