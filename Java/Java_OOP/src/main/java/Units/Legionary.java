package Units;

import java.util.ArrayList;

public class Legionary extends Character implements InGameInterface {
    int endurance;

    public Legionary(int initiation, int totalHealth, int health, int baseAttack,
                     int baseDefence, int endurance, int x, int y) {
        super(initiation, totalHealth, health, baseAttack, baseDefence, x, y);
        this.endurance = endurance;
    }

    @Override
    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
        if (this.health == 0) {
            return;
        }
        Character nearestEnemy = findNearest(teamEnemy);
        if (coords.isAdjacent(nearestEnemy.getCoords())) {
            nearestEnemy.getDamage(this.baseAttack);
            return;
        }
        if (nearestEnemy == null){
            return;
        }
        coords.stepEnemy(nearestEnemy);
    }

}