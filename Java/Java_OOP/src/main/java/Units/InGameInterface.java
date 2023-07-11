package Units;

import java.util.ArrayList;

public interface InGameInterface {
    void action(ArrayList<Character> teamEnemy, ArrayList<Character> teamAlly);

    String getInfo();
}
