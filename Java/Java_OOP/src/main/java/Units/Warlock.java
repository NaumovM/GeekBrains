package Units;

import java.util.ArrayList;

public class Warlock extends Character implements InGameInterface {
    int mana;

    public Warlock(int initiation, int totalHealth, int health, int baseAttack, int baseDefence, int mana, int x, int y) {
        super(initiation, totalHealth, health, baseAttack, baseDefence, x, y);
        this.mana = mana;
    }

    @Override
    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
        if (this.health == 0) {
            return;
        }

        for (Character chars : teamEnemy) {
            if (chars.getClass() == Sniper.class && chars.getState() == State.STAND ||
                    chars.getClass() == Crossbowman.class && chars.getState() == State.STAND) {
                chars.getDamage(baseAttack);
                return;
            }
        }

    }
}