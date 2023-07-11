package Units;

import java.util.ArrayList;

public class Monk extends Character implements InGameInterface {
    int wisdom;

    public Monk(int initiation, int health, int baseAttack, int baseDefence, int wisdom, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.wisdom = wisdom;
    }

    @Override
    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
    }
}