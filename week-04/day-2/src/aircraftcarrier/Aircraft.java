package aircraftcarrier;

public class Aircraft {

    private int maxAmmo, baseDamage, ammoStore;
    private String type;
    private boolean isPriority;


    public Aircraft(int maxAmmo, int baseDamage, boolean isPriority) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.isPriority = isPriority;
        this.ammoStore = 0;
        this.type = getClass().getSimpleName();
    }


    public int fight(){
        int damage = ammoStore * baseDamage;
        ammoStore = 0;
        return damage;
    }


    public int refill(int amountOfAmmo){
        int amountThatCanBeRefilled = getAmountOfAmmoThatCouldBeRefilled();
        if (amountOfAmmo <= amountThatCanBeRefilled) {
            ammoStore += amountOfAmmo;
            amountOfAmmo = 0;
        } else {
            ammoStore = maxAmmo;
            amountOfAmmo -= amountThatCanBeRefilled;
        }
        return amountOfAmmo;
    }


    public String getType() {
        return type;
    }


    public String getStatus(){
        String output = "Type " + getType() + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage +
                ", All Damage: " + getDamage();
        return output;
    }


    public int getDamage(){
        return ammoStore * baseDamage;
    }


    public boolean isPriority() {
        return isPriority;
    }


    public int getAmountOfAmmoThatCouldBeRefilled(){
        return maxAmmo - ammoStore;
    }

}