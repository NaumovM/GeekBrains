package Units;

public class Sniper extends Character implements InGameInterface {
    int accuracy;

    public Sniper(int initiation, int health, int baseAttack, int baseDefence, int accuracy, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.accuracy = accuracy;
    }

    @Override
    public void action() {
        System.out.println("The sniper takes aim and fires!");
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + " (" + coords.x + ", " + coords.y + ")";
    }
}