package Units;

public class Crossbowman extends Character implements InGameInterface {
    int dexterity;

    public Crossbowman(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.dexterity = 0;
    }

    public Crossbowman(int initiation, int health, int baseAttack, int baseDefence, int dexterity) {
        super(initiation, health, baseAttack, baseDefence);
        this.dexterity = dexterity;
    }

    @Override
    public void action() {
        System.out.println("The crossbowman fires an arrow!");
    }
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}