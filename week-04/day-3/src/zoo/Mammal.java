package zoo;

public class Mammal extends Animal {

    int legs;

    public Mammal(String name, int age, String color, String gender, int weight, int legs) {
        super(name, age, color, gender, weight);
        this.legs = legs;
    }


    public String breed(){
        String breedingType = "pushing minitaure versions out.";
        return breedingType;
    }
}