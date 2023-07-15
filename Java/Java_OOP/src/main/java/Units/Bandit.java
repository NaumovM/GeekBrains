package Units;

import java.util.ArrayList;

public class Bandit extends Character implements InGameInterface {
    int agility;

    public Bandit(int initiation, int totalHealth, int health, int baseAttack, int baseDefence, int agility, int x, int y) {
        super(initiation, totalHealth, health, baseAttack, baseDefence, x, y);
        this.agility = agility;
    }

    @Override
    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
    }
}