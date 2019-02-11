package aircraftcarrier;

public class AircraftCarrierMain {

    public static void main(String[] args) {

        Aircraft repcsi = new F16();
        repcsi.refill(3);
        repcsi.refill(4);
        //System.out.println(repcsi.type);
        System.out.println("ennyi maradt: " + repcsi.refill(10));
        //System.out.println(repcsi.ammoStore);
        System.out.println(repcsi.getType());

        System.out.println(repcsi.getStatus());




    }


}
