public class Peasant extends Character {
    int strength;

    public Peasant(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.strength = 0;
    }

    public Peasant(int initiation, int health, int baseAttack, int baseDefence, int strength) {
        super(initiation, health, baseAttack, baseDefence);
        this.strength = strength;
    }


    public void attack() {
        System.out.println("The peasant swings his pitchfork!");
    }
}