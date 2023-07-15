package Units;

import java.util.List;

public abstract class Character implements InGameInterface {
    public int initiation;
    int totalHealth;
    int health;
    int baseAttack;
    int baseDefence;
    String state;
    Coords coords;

    public Character(int initiation, int totalHealth, int health, int baseAttack, int baseDefence, int x, int y) {
        this.initiation = initiation;
        this.totalHealth = totalHealth;
        this.health = health;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
        this.state = "Stand";
        this.coords = new Coords(x, y);
    }

    public Coords getCoords() {
        return coords;
    }

    public int getHealth() {
        return health;
    }

    public Character findNearest(List<Character> enemies) {
        Character nearestEnemy = null;
        double minDistance = Integer.MAX_VALUE;
        for (Character enemy : enemies) {
            double distance = calculateDistance(coords, enemy.getCoords());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
    }


    public static double calculateDistance(Coords coords1, Coords coords2) {
        int x1 = coords1.getX();
        int y1 = coords1.getY();
        int x2 = coords2.getX();
        int y2 = coords2.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

//    public String getInfo() {
//        return String.format("%s: health=%d, (%d, %d)", this.getClass().getSimpleName(),
//                this.health, this.coords.x, this.coords.y);
//    }

    public String getInfo() {
        return String.format("%s: \u2661:%d \u2694:%d Ar:%d In:%d", this.getClass().getSimpleName(),
                this.health, this.baseAttack, this.baseDefence, this. initiation);
    }

    @Override
    public String toString() {return this.getClass().getSimpleName();}

    protected void getDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            state = "die";
            health = 0;
        }

        if (health > totalHealth) {
            health = totalHealth;
        }
    }
}

