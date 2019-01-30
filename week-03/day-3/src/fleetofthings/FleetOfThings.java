package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing thing3 = new Thing ("Stand up");
        Thing thing4 = new Thing ("Eat lunch");
        thing3.complete();
        thing4.complete();

        fleet.add(new Thing ("Get milk"));
        fleet.add(new Thing ("Remove the obstacles"));
        fleet.add(thing3);
        fleet.add(thing4);

        System.out.println(fleet);
    }
}