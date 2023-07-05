package Units;

public class Peasant extends Character implements InGameInterface {
    int strength;

    public Peasant(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.strength = 0;
    }

    public Peasant(int initiation, int health, int baseAttack, int baseDefence, int strength) {
        super(initiation, health, baseAttack, baseDefence);
        this.strength = strength;
    }

    @Override
    public void action() {
        System.out.println("The peasant swings his pitchfork!");
    }
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}