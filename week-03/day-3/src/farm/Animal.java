package farm;


public class Animal {

    int thirst;
    int hunger;


    public Animal(){
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
