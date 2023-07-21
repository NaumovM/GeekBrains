import Units.*;
import Units.Character;

import java.util.*;

public class Main {


    public static ArrayList<Character> characters1 = new ArrayList<>();
    public static ArrayList<Character> characters2 = new ArrayList<>();
    public static ArrayList<Character> allCharacters = new ArrayList<>();

    public static void main(String[] args) {


        fillList(characters1, 1);
        fillList(characters2, 10);

        allCharacters.addAll(characters1);
        allCharacters.addAll(characters2);
        allCharacters.sort(Comparator.comparingInt((Character c) -> c.initiation));
        Scanner in = new Scanner(System.in);
        while (isAtLeastOneAlive(characters1) && isAtLeastOneAlive(characters2)) {
            View.view();
            in.nextLine();
            for (Character chars : allCharacters) {
                if (characters1.contains(chars)) {
                    chars.action(characters2, characters1);
                } else {
                    chars.action(characters1, characters2);
                }
            }

        }
    }

    public static boolean isAtLeastOneAlive(ArrayList<Character> team) {
        for (Character chars : team) {
            if (!chars.isDead()) return true;
        }
        return false;
    }


    public static void fillList(List<Character> list, int side) {
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int randomChar = random.nextInt(7);
            switch (randomChar) {
                case 0:
                    list.add(new Bandit(2, 130, 80, 20, 10, 3, side, i));
                    break;
                case 1:
                    list.add(new Peasant(1, 100, 100, 5, 5, 0, side, i));
                    break;
                case 2:
                    list.add(new Sniper(3, 50, 50, 19, 5, 10, side, i));
                    break;
                case 3:
                    list.add(new Warlock(2, 150, 150, 23, 10, 10, side, i));
                    break;
                case 4:
                    list.add(new Legionary(3, 250, 250, 39, 25, 10, side, i));
                    break;
                case 5:
                    list.add(new Crossbowman(3, 65, 65, 27, 7, 7, side, i));
                    break;
                case 6:
                    list.add(new Monk(4, 120, 120, 30, 18, 20, side, i));
                    break;

            }
        }
    }
}