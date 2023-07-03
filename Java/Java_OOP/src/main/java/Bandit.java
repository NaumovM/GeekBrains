public class Bandit extends Character {
    int agility;

    public Bandit(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.agility = 0;
    }

    public Bandit(int initiation, int health, int baseAttack, int baseDefence, int agility) {
        super(initiation, health, baseAttack, baseDefence);
        this.agility = agility;
    }


    public void attack() {
        System.out.println("The bandit throws a dagger!");
    }
}