package thegardenapplication;

public class Flower extends Plant {

    public Flower(String color){
        super(color, 5, 0.75);
        // name = "Flower";
        // minWaterlevel = 5;
        // waterAbsorbtionCapacity = 0.75;
        //currentWaterLevel-t átveszi automatikusan apuciból
        /* Polimorfizmusnál a gyereknek mindig meg kell kívnia az apa konstruktorait (vagy simán örökli, és/vagy átveszi. De ahhoz, hogy
        a megfelelő apuci konstruktort vegye át, akkor annak az apuci konstruktornak az összes értékét meg kell hívni.
        Az mindegy, hogy a superclass fieldjéből mit veszek át pluszban a gyerek konstruktorába.

        Ha két parent és két gyerek van, akkor a gyerekek használhatják vagy az egyik, vagy a másik konstruktort. De csak
        egyet, pl második gyerek konstruktor az első parent konstruktort, az első gyerek konstruktor a második parent konstruktort.
         */
    }

    public static void valamiflower(){

    }

}