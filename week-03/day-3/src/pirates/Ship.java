package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List<Pirate> shipCrew = new ArrayList<>();


    public void fillShip(Pirate pirate) {
        boolean isThereACaptainAlreadyOnShip = false;
        if (shipCrew.size() > 0 && pirate.isHeACaptain()) {
            for (int i = 0; i < shipCrew.size(); i++) {
                if (shipCrew.get(i).isHeACaptain()) {
                    isThereACaptainAlreadyOnShip = true;
                    System.out.println("There is already a captain on the ship! This pirate cannot be added!");
                    break;
                }
            }
            if (!isThereACaptainAlreadyOnShip) {
                shipCrew.add(pirate);
            }
        } else {
            shipCrew.add(pirate);
        }
    }


    public void getShipStatus() {
        int aliveCounter = 0;
        String aliveOrNot;
        for (int i = 0; i < shipCrew.size(); i++) {
            if (shipCrew.get(i).isHeACaptain()) {
                aliveOrNot = shipCrew.get(i).isAlive() ? "alive" : "dead";
                System.out.println("The captain is " + aliveOrNot + " and consumed " + shipCrew.get(i).getInoxicationLevel() + " rum.");
            }
            aliveCounter = shipCrew.get(i).isAlive() ? (aliveCounter += 1) : aliveCounter;
        }
        System.out.println(aliveCounter + " pirates are alive on the ship.");
    }
}