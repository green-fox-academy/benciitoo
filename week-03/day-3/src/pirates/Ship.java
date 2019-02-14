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
        boolean isThereACaptainOnThisShip = false;
        String aliveOrNot = "";
        for (int i = 0; i < shipCrew.size(); i++) {
            if (shipCrew.get(i).isHeACaptain()) {
                aliveOrNot = shipCrew.get(i).isAlive() ? "alive" : "dead";
                System.out.println("The captain is " + aliveOrNot + " and consumed " + getCaptainIntoxicationLevel() + " rum.");
                isThereACaptainOnThisShip = true;
            }
        }
        if (!isThereACaptainOnThisShip) {
            System.out.println("There is no captain on this ship.");
        }
        System.out.println(aliveCounter() + " pirates are alive on the ship.");
    }


    public int aliveCounter() {
        int aliveCount = 0;
        for (int i = 0; i < shipCrew.size(); i++) {
            aliveCount = shipCrew.get(i).isAlive() ? (aliveCount += 1) : aliveCount;
        }
        return aliveCount;
    }


    public int getCaptainIntoxicationLevel() {
        int intoxicationLevel = 0;
        for (Pirate pirate : shipCrew) {
            if (pirate.isHeACaptain()) {
                intoxicationLevel = pirate.getInoxicationLevel();
            }
        }
        return intoxicationLevel;
    }


    public boolean battle(Ship otherShip) {
        boolean didWeWin = false;
        int thisShipScore = calculateShipScore();
        int otherShipsScore = otherShip.calculateShipScore();
        System.out.println(thisShipScore + "  " + otherShipsScore);

        if (thisShipScore > otherShipsScore) {
            didWeWin = true;
            otherShip.killRandomNumberOfPirates();
            party();
        } else if (otherShipsScore > thisShipScore) {
            killRandomNumberOfPirates();
            otherShip.party();
        } else {
            System.out.println("The two ships are equally strong. They both sail away without a fight," +
                    " and forging better plans for the next battle.");
        }
        return didWeWin;
    }


    public int calculateShipScore() {
        return aliveCounter() - getCaptainIntoxicationLevel();
    }


    public void killRandomNumberOfPirates() {
        for (int i = 0; i < shipCrew.size(); i++) {
            if ((int) (Math.random() * 1) == 1) {
                shipCrew.get(i).die();
            }
        }
    }


    public void party() {
        for (Pirate pirate : shipCrew) {
            for (int i = 0; i < ((int) (Math.random() * 6)); i++) {
                pirate.drinkSomeRum();
            }
        }
    }


}