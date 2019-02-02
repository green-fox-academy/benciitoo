package sharpieset;

public class SharpieSetMain {

    public static void main(String[] args) {

        SharpieSet setOfSharpies = new SharpieSet();

        setOfSharpies.sharpies.add(new Sharpie("yellow", 5));
        setOfSharpies.sharpies.add(new Sharpie("green", 3));
        setOfSharpies.sharpies.add(new Sharpie("red", 0));
        setOfSharpies.sharpies.add(new Sharpie("brown", 8));
        setOfSharpies.sharpies.add(new Sharpie("black", 0));
        setOfSharpies.sharpies.add(new Sharpie("blue", 7));

        // System.out.println(setOfSharpies.sharpies.get(0).color);
        System.out.println("Number of usable sharpies: " + setOfSharpies.countUsable());

        System.out.println("Number of all sharpies before removing the useless ones: " + setOfSharpies.sharpies.size());
        setOfSharpies.removeTrash();
        System.out.println("Number of all sharpies after removing the useless ones: " + setOfSharpies.sharpies.size());

    }

}

/* Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies */