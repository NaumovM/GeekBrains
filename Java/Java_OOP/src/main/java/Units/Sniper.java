package Units;

import java.util.ArrayList;

public class Sniper extends Character implements InGameInterface {
    int bullets;

    public Sniper(int initiation, int totalHealth, int health, int baseAttack, int baseDefence, int bullets, int x, int y) {
        super(initiation, totalHealth, health, baseAttack, baseDefence, x, y);
        this.bullets = bullets;
    }

    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
        if (this.health == 0 || bullets == 0) {
            return;
        }
        Character nearestEnemy = findNearest(teamEnemy);
        nearestEnemy.getDamage(baseAttack);
        for (Character chars : teamAlly) {
            if (chars.getClass() == Peasant.class && chars.getState() == State.STAND) {
                chars.setState(State.BUSY);
                return;
            }
        }
        this.bullets -= 1;
    }


}