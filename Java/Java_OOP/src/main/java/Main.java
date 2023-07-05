import Units.*;
import Units.Character;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    //у каждого персонажа уникальное свойство (доступно 2 конструктора), одно действие, и 4 общих свойства
    //удален метод атаки из Character.java. Классы запакованы в Units. Остальное по заданию
    public static void main(String[] args) {
        Character peasant = new Peasant(1, 100, 5, 5, 5);
        Character bandit = new Bandit(2, 80, 20, 10, 3);
        Character sniper = new Sniper(3, 50, 35, 5, 6);
        Character warlock = new Warlock(2, 150, 23, 10);
        Character legionary = new Legionary(3, 250, 15, 25);
        Character crossbowman = new Crossbowman(3, 65, 37, 7);
        Character monk = new Monk(4, 120, 30, 18);


        List<Character> characters1 = new ArrayList<>();
        List<Character> characters2 = new ArrayList<>();
        fillList(characters1);
        fillList(characters2);
        for (Character chars : characters1) {
            System.out.println(chars.getInfo());
        }
        System.out.println("------");
        for (Character chars : characters2) {
            System.out.println(chars.getInfo());
        }

    }

    public static void fillList(List<Character> list) {
        Random random = new Random();
        for (int i = 1; i < 10; i++) {
            int randomChar = random.nextInt(7);
            switch (randomChar) {
                case 0:
                    list.add(new Bandit(2, 80, 20, 10, 3));
                    break;
                case 1:
                    list.add(new Peasant(1, 100, 5, 5, 5));
                    break;
                case 2:
                    list.add(new Sniper(3, 50, 35, 5, 6));
                    break;
                case 3:
                    list.add(new Warlock(2, 150, 23, 10));
                    break;
                case 4:
                    list.add(new Legionary(3, 250, 15, 25));
                    break;
                case 5:
                    list.add(new Crossbowman(3, 65, 37, 7));
                    break;
                case 6:
                    list.add(new Monk(4, 120, 30, 18));
                    break;
            }
        }
    }
}
