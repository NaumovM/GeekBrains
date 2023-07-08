package Units;

public abstract class Character implements InGameInterface {
    int initiation;
    int health;
    int baseAttack;
    int baseDefence;
    Coords coords;

    public Character(int initiation, int health, int baseAttack, int baseDefence, int x, int y) {
        this.initiation = initiation;
        this.health = health;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
        this.coords = new Coords(x, y);
    }

    public Coords getCoords() {
        return coords;
    }
}