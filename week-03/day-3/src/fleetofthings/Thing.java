package fleetofthings;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
        // ? -> ha igaz, akkor az elsőre ugrik, ha nem igaz, akkor a másikra
    }
}