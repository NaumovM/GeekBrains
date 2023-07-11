package Units;

import java.util.ArrayList;

public class Peasant extends Character implements InGameInterface {
    int strength;

    public Peasant(int initiation, int health, int baseAttack, int baseDefence, int strength, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.strength = strength;
    }

    @Override
    public void action(ArrayList<Character> team) {}

}