package Units;

import java.util.ArrayList;
import java.util.Comparator;

public class Monk extends Character implements InGameInterface {
    int wisdom;

    public Monk(int initiation, int totalHealth, int health, int baseAttack, int baseDefence, int wisdom, int x, int y) {
        super(initiation, totalHealth, health, baseAttack, baseDefence, x, y);
        this.wisdom = wisdom;
    }

    @Override

    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
        if (this.isDead()) return;

        Character mostInjuredCharacter = teamAlly.get(0);

        for (Character ally : teamAlly) {
            if (!ally.state.equals(State.DEAD) && ally.health < ally.totalHealth &&
                    (ally.totalHealth - ally.health) > (mostInjuredCharacter.totalHealth - mostInjuredCharacter.health)) {
                mostInjuredCharacter = ally;
            }
        }
        if (mostInjuredCharacter.health == mostInjuredCharacter.totalHealth) {
            return;
        }
        mostInjuredCharacter.getDamage(-(this.baseAttack));
    }
}
