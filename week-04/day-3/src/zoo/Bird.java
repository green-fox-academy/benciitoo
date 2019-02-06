package zoo;

public class Bird extends Animal {

    public Bird(String name, int age, String color, String gender, int weight) {
        super(name, age, color, gender, weight);

    }


    public String breed(){
        String breedingType = "eggs.";
        return breedingType;
    }
}