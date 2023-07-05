package Units;

public class Legionary extends Character implements InGameInterface {
    int endurance;

    public Legionary(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.endurance = 0;
    }

    public Legionary(int initiation, int health, int baseAttack, int baseDefence, int endurance) {
        super(initiation, health, baseAttack, baseDefence);
        this.endurance = endurance;
    }


    @Override
    public void action() {
        System.out.println("The legionary charges with his sword!");
    }
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}