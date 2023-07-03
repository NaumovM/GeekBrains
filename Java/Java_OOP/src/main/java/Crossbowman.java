public class Crossbowman extends Character {
    int dexterity;

    public Crossbowman(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.dexterity = 0;
    }

    public Crossbowman(int initiation, int health, int baseAttack, int baseDefence, int dexterity) {
        super(initiation, health, baseAttack, baseDefence);
        this.dexterity = dexterity;
    }


    public void attack() {
        System.out.println("The crossbowman fires an arrow!");
    }
}