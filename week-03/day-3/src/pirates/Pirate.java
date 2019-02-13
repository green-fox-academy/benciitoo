package pirates;

public class Pirate {

    private int inoxicationLevel;
    private boolean alive;
    private boolean isHeACaptain;


    public Pirate(boolean isHeACaptain) {
        this.isHeACaptain = isHeACaptain;
        this.inoxicationLevel = 0;
        this.alive = true;
    }


    public void drinkSomeRum() {
        if (alive) {
            inoxicationLevel++;
        } else {
            heIsDead();
        }
    }


    public void howsItGoingMate() {
        if (alive) {
            if (inoxicationLevel > 4) {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                inoxicationLevel = 0;
            } else {
                System.out.println("Pour me anudder!");
            }
        } else {
            heIsDead();
        }
    }


    public void die() {
        alive = false;
    }


    public void brawl(Pirate otherPirate){
        if (otherPirate.alive) {
            int chanceToLive = 1 + (int)(Math.random() * 99);
            if (chanceToLive <= 33){
                die();
                System.out.println("Pirate died");
            } else if (chanceToLive > 33 && chanceToLive < 66){  //hiába szól az IntelliJ, akkor sem always true!
                otherPirate.die();
                System.out.println("Otherpirate died");
            } else {
                inoxicationLevel = 0;
                otherPirate.inoxicationLevel = 0;
                System.out.println("Both passed out");
            }
        } else {
            System.out.println("It takes two living pirates to do a fight, so this won't happen y'all! Back to your posts!");
        }
    }


    public void heIsDead(){
        System.out.println("He's dead.");
    }


    public boolean isHeACaptain() {
        return isHeACaptain;
    }


    public int getInoxicationLevel() {
        return inoxicationLevel;
    }


    public boolean isAlive() {
        return alive;
    }
}