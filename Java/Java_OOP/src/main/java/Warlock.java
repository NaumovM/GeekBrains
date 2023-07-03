public class Warlock extends Character {
    int mana;

    public Warlock(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.mana = 0;
    }

    public Warlock(int initiation, int health, int baseAttack, int baseDefence, int mana) {
        super(initiation, health, baseAttack, baseDefence);
        this.mana = mana;
    }

    public void attack() {
        System.out.println("The warlock casts a spell!");
    }
}