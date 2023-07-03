public class Legionary extends Character {
    int endurance;

    public Legionary(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.endurance = 0;
    }
    public Legionary(int initiation, int health, int baseAttack, int baseDefence, int endurance) {
        super(initiation, health, baseAttack, baseDefence);
        this.endurance = endurance;
    }

    public void attack() {
        System.out.println("The legionary charges with his sword!");
    }
}