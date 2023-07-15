package Units;

import java.util.ArrayList;

public class Sniper extends Character implements InGameInterface {
    int accuracy;

    public Sniper(int initiation, int totalHealth, int health, int baseAttack, int baseDefence, int accuracy, int x, int y) {
        super(initiation, totalHealth, health, baseAttack, baseDefence, x, y);
        this.accuracy = accuracy;
    }

    @Override
    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly)  {
    }
}