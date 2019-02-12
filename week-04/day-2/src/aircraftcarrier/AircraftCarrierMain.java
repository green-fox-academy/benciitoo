package aircraftcarrier;

import java.util.Objects;

public class AircraftCarrierMain {

    public static void main(String[] args) {

        Aircraft repcsi = new F16();
        Carrier carrier1 = new Carrier(2000, 3000);
        Carrier carrier2 = new Carrier(4000, 3500);
        Carrier littleCarrier = new Carrier(300, 200);

        carrier1.add(repcsi);
        carrier1.add(new F16());
        carrier1.add(new F16());
        carrier1.add(new F16());
        carrier1.add(new F16());
        carrier1.add(new F35());
        carrier1.add(new F35());
        carrier1.add(new F35());
        carrier1.getStatus();
        carrier1.fill();
        carrier1.getStatus();



        carrier2.add(new F16());
        carrier2.add(new F16());
        carrier2.add(new F16());
        carrier2.add(new F16());
        carrier2.add(new F16());
        carrier2.add(new F35());
        carrier2.getStatus();

        carrier1.fight(carrier2);
        carrier2.getStatus();
        carrier1.getStatus();
    }
}