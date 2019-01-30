package counter;

public class Counter {

    int value;
    int startingValue;

    public Counter(){
        startingValue = value;
    }

    public Counter(int valueNumber){
        value = valueNumber;
        startingValue = value;
    }


    public void add(int addValue){
        value += addValue;
    }


    public void add(){
        value += 1;
    }


    public int get(){
        return value;
    }


    public void reset(){
        value = startingValue;
    }

}
