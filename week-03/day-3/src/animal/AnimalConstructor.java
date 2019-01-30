package animal;

public class AnimalConstructor {

    int thirst;
    int hunger;


    public AnimalConstructor(){
        thirst = 50;
        hunger = 50;
    }


    public void eat(){
        hunger--;
    }


    public void drink(){
        thirst--;
    }


    public void play(){
        hunger++;
        thirst++;
    }

}
