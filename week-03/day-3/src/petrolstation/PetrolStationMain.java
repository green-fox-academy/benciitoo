package petrolstation;

public class PetrolStationMain {

    public static void main(String[] args) {

        Station mol = new Station(3000);
        Car opel = new Car();

        System.out.println("Petrol station gas amount: " + mol.gasAmount);
        System.out.println("Car gas amount: " + opel.gasAmount);

        mol.refill(opel);

        System.out.println("--------------After refill--------------");
        System.out.println("Petrol station gas amount: " + mol.gasAmount);
        System.out.println("Car gas amount: " + opel.gasAmount);

    }

}

/* Create Station and Car classes
Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
gasAmount
capacity
create constructor for Car where:
initialize gasAmount -> 0
initialize capacity -> 100 */