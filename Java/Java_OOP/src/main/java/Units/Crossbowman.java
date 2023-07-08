package Units;

public class Crossbowman extends Character implements InGameInterface {
    int dexterity;


    public Crossbowman(int initiation, int health, int baseAttack, int baseDefence, int dexterity, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.dexterity = dexterity;
    }

    @Override
    public void action() {
        System.out.println("The crossbowman fires an arrow!");
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + " (" + coords.x + ", " + coords.y + ")";
    }
}