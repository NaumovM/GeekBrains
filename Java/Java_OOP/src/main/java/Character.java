public abstract class Character {
    int initiation;
    int health;
    int baseAttack;
    int baseDefence;

    public Character(int initiation, int health, int baseAttack, int baseDefence) {
        this.initiation = initiation;
        this.health = health;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
    }


    public abstract void attack();
}