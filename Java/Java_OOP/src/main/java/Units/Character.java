package Units;

import java.util.List;


public abstract class Character implements InGameInterface {
    public int initiation;
    int totalHealth;
    int health;
    int baseAttack;
    int baseDefence;
    State state;
    Coords coords;

    public Character(int initiation, int totalHealth, int health, int baseAttack, int baseDefence, int x, int y) {
        this.initiation = initiation;
        this.totalHealth = totalHealth;
        this.health = health;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
        this.state = State.STAND;
        this.coords = new Coords(x, y);
    }

    public Coords getCoords() {
        return coords;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public int getHealth() {
        return health;
    }

    public Character findNearest(List<Character> enemies) {
        Character nearestEnemy = null;
        double minDistance = Integer.MAX_VALUE;
        for (Character enemy : enemies) {
            if (!enemy.state.equals(State.DEAD)) {
                double distance = coords.calculateDistance(enemy.getCoords());
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestEnemy = enemy;
                }
            }
        }

        return nearestEnemy;
    }
    public String getInfo() {
        return String.format("%s: \u2661:%d \u2694:%d Ar:%d In:%d %s", this.getClass().getSimpleName(),
                this.health, this.baseAttack, this.baseDefence, this.initiation, this.state);
    }

    public boolean isDead() {
        return state.equals(State.DEAD);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    protected void getDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            setState(State.DEAD);
            health = 0;
        }

        if (health > totalHealth) {
            health = totalHealth;
        }
    }
}

