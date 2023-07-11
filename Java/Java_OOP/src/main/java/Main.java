import Units.*;
import Units.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Units.Character.calculateDistance;
import static Units.Character.searchNearestEnemy;

public class Main {
    //добавлен класс Coords  с геттерами + в абстрактный класс.
    //у персонажей оставлен 1 конструктор и отредактирован getInfo под координаты
    //в мейн добавлен поиск дистанции и вывод ближайшего врага. Не знаю как убрать его из мейна и надо ли.
    //в целом задание сложное, юзал чатгпт для помощи.
    public static void main(String[] args) {
//        Character peasant = new Peasant(1, 100, 5, 5, 3, 0, 0);
//        Character bandit = new Bandit(2, 80, 20, 10, 3, 0, 0);
//        Character sniper = new Sniper(3, 50, 35, 5, 6, 0, 0);
//        Character warlock = new Warlock(2, 150, 23, 10, 10, 0, 0);
//        Character legionary = new Legionary(3, 250, 15, 25, 10, 0, 0);
//        Character crossbowman = new Crossbowman(3, 65, 37, 7, 7, 0, 0);
//        Character monk = new Monk(4, 120, 30, 18, 25, 0, 0);

        ArrayList<Character> characters1 = new ArrayList<>();
        ArrayList<Character> characters2 = new ArrayList<>();

        fillList(characters1, 0);
        fillList(characters2, 9);

        characters1.forEach(n -> n.action(characters2));
        System.out.println("------");
        characters2.forEach(n -> n.action(characters1));
        System.out.println("------");
        characters1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("------");
        characters2.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("------");

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