package Units;


public class Warlock extends Character implements InGameInterface {
    int mana;

    public Warlock(int initiation, int health, int baseAttack, int baseDefence, int mana, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.mana = mana;
    }

    @Override
    public void action() {
        System.out.println("The warlock casts a spell!");
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + " (" + coords.x + ", " + coords.y + ")";
    }
}