package zoo;

public abstract class Animal {

    String name;
    int age;
    String color;
    String gender;
    int weight;


    public Animal(String name, int age, String color, String gender, int weight){
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }


    public abstract String breed();
}