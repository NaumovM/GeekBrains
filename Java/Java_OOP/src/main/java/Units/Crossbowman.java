package Units;

import java.util.ArrayList;

public class Crossbowman extends Character implements InGameInterface {
    int arrows;

    public Crossbowman(int initiation, int totalHealth, int health, int baseAttack, int baseDefence, int arrows, int x, int y) {
        super(initiation, totalHealth, health, baseAttack, baseDefence, x, y);
        this.arrows = arrows;
    }

    @Override
    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
        if (this.health == 0 || arrows == 0) {
            return;
        }
        Character nearestEnemy = findNearest(teamEnemy);
        nearestEnemy.getDamage(baseAttack);
        for (Character chars : teamAlly) {
            if (chars.getClass() == Peasant.class && chars.state == ("Stand")) {
                chars.state = "busy";
                return;
            }
        }
        this.arrows -= 1;
    }

    @Override //проверка расхода стрел
    public String getInfo() {
        return String.format("%s: \u2661:%d, \u2694:%d Ar:%d In:%d", this.getClass().getSimpleName(),
                this.health, this.baseAttack, this.arrows, this.initiation);
    }
}