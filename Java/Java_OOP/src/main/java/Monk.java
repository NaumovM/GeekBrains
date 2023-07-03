public class Monk extends Character {
    int wisdom;

    public Monk(int initiation, int health, int baseAttack, int baseDefence) {
        super(initiation, health, baseAttack, baseDefence);
        this.wisdom = 0;
    }

    public Monk(int initiation, int health, int baseAttack, int baseDefence, int wisdom) {
        super(initiation, health, baseAttack, baseDefence);
        this.wisdom = wisdom;
    }

    public void attack() {
        System.out.println("The monk performs a martial arts move!");
    }
}