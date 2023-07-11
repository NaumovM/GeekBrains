package Units;

import java.util.ArrayList;

public class Crossbowman extends Character implements InGameInterface {
    int arrows;


    public Crossbowman(int initiation, int health, int baseAttack, int baseDefence, int arrows, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.arrows = arrows;
    }

    @Override
    public void action(ArrayList<Character> team) {
        if (this.health == 0 || arrows == 0) {
            return;
        }
        Character nearestEnemy = findNearest(team);
        nearestEnemy.health -= this.baseAttack;

    }
}