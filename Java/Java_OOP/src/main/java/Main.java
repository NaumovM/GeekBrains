import Units.*;
import Units.Character;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> characters1 = new ArrayList<>();
        ArrayList<Character> characters2 = new ArrayList<>();
        ArrayList<Character> allCharacters = new ArrayList<>();

        fillList(characters1, 0);
        fillList(characters2, 9);

        allCharacters.addAll(characters1);
        allCharacters.addAll(characters2);
        allCharacters.sort(Comparator.comparingInt((Character c) -> c.initiation));

        for (Character chars : allCharacters) {
            if (characters1.contains(chars)) {
                chars.action(characters2, characters1);
            } else {
                chars.action(characters1, characters2);
            }
        }

        characters1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("------------------");
        characters2.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("------------------");
    }


    public static void fillList(List<Character> list, int side) {
        Random random = new Random();
        for (int i = 1; i < 10; i++) {
            int randomChar = random.nextInt(7);
            switch (randomChar) {
                case 0:
                    list.add(new Bandit(2, 80, 20, 10, 3, side, i));
                    break;
                case 1:
                    list.add(new Peasant(1, 100, 5, 5, 0, side, i));
                    break;
                case 2:
                    list.add(new Sniper(3, 50, 35, 5, 6, side, i));
                    break;
                case 3:
                    list.add(new Warlock(2, 150, 23, 10, 10, side, i));
                    break;
                case 4:
                    list.add(new Legionary(3, 250, 15, 25, 10, side, i));
                    break;
                case 5:
                    list.add(new Crossbowman(3, 65, 37, 7, 7, side, i));
                    break;
                case 6:
                    list.add(new Monk(4, 120, 30, 18, 20, side, i));
                    break;

            }
        }
    }
}