package Units;

import java.util.ArrayList;

public class Crossbowman extends Character implements InGameInterface {
    int arrows;

    public Crossbowman(int initiation, int health, int baseAttack, int baseDefence, int arrows, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.arrows = arrows;
    }

    @Override
    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
        if (this.health == 0 || arrows == 0) {
            return;
        }
        Character nearestEnemy = findNearest(teamEnemy);
        nearestEnemy.health -= this.baseAttack;
        for (Character chars : teamAlly) {
            if (chars.getClass() == Peasant.class) {
                return;
            }
        }
        this.arrows -= 1;
    }
    @Override //проверка расхода стрел
    public String getInfo() {
        return String.format("%s: health=%d, ammo = %d", this.getClass().getSimpleName(),
                this.health, this.arrows);
    }
}