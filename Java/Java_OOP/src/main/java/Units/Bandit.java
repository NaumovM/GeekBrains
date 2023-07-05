package Units;

public class Bandit extends Character implements InGameInterface {
    int agility;

    public Bandit(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.agility = 0;
    }

    public Bandit(int initiation, int health, int baseAttack, int baseDefence, int agility) {
        super(initiation, health, baseAttack, baseDefence);
        this.agility = agility;
    }

    @Override
    public void action() {
        System.out.println("The bandit throws a dagger!");
    }
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}