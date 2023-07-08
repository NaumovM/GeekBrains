import Units.*;
import Units.Character;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    //добавлен класс Coords  с геттерами + в абстрактный класс.
    //у персонажей оставлен 1 конструктор и отредактирован getInfo под координаты
    //в мейн добавлен поиск дистанции и вывод ближайшего врага. Не знаю как убрать его из мейна и надо ли.
    //в целом задание сложное, юзал чатгпт для помощи.
    public static void main(String[] args) {
        Character peasant = new Peasant(1, 100, 5, 5, 3, 0, 0);
        Character bandit = new Bandit(2, 80, 20, 10, 3, 0, 0);
        Character sniper = new Sniper(3, 50, 35, 5, 6, 0, 0);
        Character warlock = new Warlock(2, 150, 23, 10, 10, 0, 0);
        Character legionary = new Legionary(3, 250, 15, 25, 10, 0, 0);
        Character crossbowman = new Crossbowman(3, 65, 37, 7, 7, 0, 0);
        Character monk = new Monk(4, 120, 30, 18, 25, 0, 0);


        List<Character> characters1 = new ArrayList<>();
        List<Character> characters2 = new ArrayList<>();

        fillList(characters1, 0);
        fillList(characters2, 9);

        for (Character chars : characters1) {
            System.out.println(chars.getInfo());
        }
        System.out.println("------");
        for (Character chars : characters2) {
            System.out.println(chars.getInfo());
        }
        System.out.println("------");
        searchNearestEnemy(characters1, characters2);


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

    public static void searchNearestEnemy(List<Character> characters1, List<Character> characters2) {
        for (Character char1 : characters1) {
            double minDistance = Double.MAX_VALUE;
            Character nearestEnemy = null;

            for (Character char2 : characters2) {
                double distance = calculateDistance(char1.getCoords(), char2.getCoords());
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestEnemy = char2;
                }
            }
            System.out.println("For " + char1.getClass().getSimpleName()+ " (" + char1.getCoords().getX() + ", " + char1.getCoords().getY() + ")");
            System.out.println("Nearest enemy: " + nearestEnemy.getClass().getSimpleName());
            System.out.println("Distance: " + minDistance);
            System.out.println("------");
        }
    }
    public static double calculateDistance(Coords coords1, Coords coords2) {
        int x1 = coords1.getX();
        int y1 = coords1.getY();
        int x2 = coords2.getX();
        int y2 = coords2.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}


