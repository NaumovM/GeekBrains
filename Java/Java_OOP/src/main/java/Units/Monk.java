package Units;

public class Monk extends Character implements InGameInterface {
    int wisdom;

    public Monk(int initiation, int health, int baseAttack, int baseDefence, int wisdom, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.wisdom = wisdom;
    }


    @Override
    public void action() {
        System.out.println("The monk performs a martial arts move!");
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + " (" + coords.x + ", " + coords.y + ")";
    }
}