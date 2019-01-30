package animal;

public class AnimalMain {
    public static void main(String[] args) {

        AnimalConstructor tortoise = new AnimalConstructor();
        AnimalConstructor giraffe = new AnimalConstructor();
        AnimalConstructor zebra = new AnimalConstructor();

        zebra.drink();
        zebra.drink();
        zebra.drink();
        zebra.eat();
        zebra.play();
        System.out.println("Hunger: " + zebra.hunger + " Thirst: " + zebra.thirst);

    }
}