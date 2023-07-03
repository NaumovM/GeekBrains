public class Sniper extends Character {
    int accuracy;

    public Sniper(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.accuracy = 0;
    }

    public Sniper(int initiation, int health, int baseAttack, int baseDefence, int accuracy) {
        super(initiation, health, baseAttack, baseDefence);
        this.accuracy = accuracy;
    }

    public void attack() {
        System.out.println("The sniper takes aim and fires!");
    }
}