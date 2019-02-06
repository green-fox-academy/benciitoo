package thegardenapplication;

public class TheGardenMain {

    public static void main(String[] args) {

        Garden kert = new Garden();

        Plant virag1 = new Flower("yellow");
        Plant virag2 = new Flower("blue");
        Plant fa1 = new Tree("purple");
        Plant fa2 = new Tree("orange");
        kert.listOfPlants.add(virag1);
        kert.listOfPlants.add(virag2);
        kert.listOfPlants.add(fa1);
        kert.listOfPlants.add(fa2);

        // kert.listOfPlants.add(new Flower("yellow"));
        // Így rögtön lehet generálni és hozzáadni egy Plant (?) apucijú Flower-t a Plant-et tartalmazó listába

        kert.reportGardenStatus();
        System.out.println();

        kert.watering(40);
        kert.reportGardenStatus();
        System.out.println();

        kert.watering(70);
        kert.reportGardenStatus();
    }
}