package zoo;

public class Reptile extends Animal {

    public Reptile(String name, int age, String color, String gender, int weight) {
        super(name, age, color, gender, weight);
    }


    public String breed(){
        String breedingType = "eggs.";
        return breedingType;
    }
}