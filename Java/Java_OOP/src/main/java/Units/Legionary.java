package Units;

import java.util.ArrayList;

public class Legionary extends Character implements InGameInterface {
    int endurance;

    public Legionary(int initiation, int health, int baseAttack, int baseDefence, int endurance, int x, int y) {
        super(initiation, health, baseAttack, baseDefence, x, y);
        this.endurance = endurance;
    }


    @Override
    public void action(ArrayList<Character> team) {

    }
}