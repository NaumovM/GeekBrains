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
//    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
//        teamAlly.sort(new Comparator<Character>() {
//            @Override
//            public int compare(Character o1, Character o2) {
//                return (int) ((o1.totalHealth - o1.health) - (o2.totalHealth - o2.health));
//            }
//        });
//        teamAlly.get(0).getDamage(this.baseAttack);
    public void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly) {
        Character mostInjuredCharacter = teamAlly.get(0);

        for (Character ally : teamAlly) {
            if (!ally.state.equals(State.DEAD) && ally.health < ally.totalHealth &&
                    (ally.totalHealth - ally.health) > (mostInjuredCharacter.totalHealth - mostInjuredCharacter.health)) {
                mostInjuredCharacter = ally;
            }
        }

        mostInjuredCharacter.getDamage(-(this.baseAttack));
    }
}
