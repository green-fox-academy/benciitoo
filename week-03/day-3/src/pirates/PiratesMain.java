package pirates;

public class PiratesMain {

    public static void main(String[] args) {


        Pirate pirate1 = new Pirate(false);
        Pirate pirate2 = new Pirate(false);

        pirate1.drinkSomeRum();
        pirate1.howsItGoingMate();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.howsItGoingMate();

        pirate1.brawl(pirate2);
        pirate1.howsItGoingMate();
        pirate2.howsItGoingMate();

        Ship pirateship = new Ship();
        pirateship.fillShip(pirate1);
        pirateship.fillShip(pirate2);
        pirateship.fillShip(new Pirate(false));
        pirateship.fillShip(new Pirate(true));
        pirateship.fillShip(new Pirate(true));


        pirateship.getShipStatus();



    }



}
