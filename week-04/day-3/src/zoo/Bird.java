package zoo;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

    public Bird(String name, int age, String color, String gender, int weight) {
        super(name, age, color, gender, weight);

    }


    public String breed(){
        String breedingType = "eggs.";
        return breedingType;
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeoff() {

    }
}