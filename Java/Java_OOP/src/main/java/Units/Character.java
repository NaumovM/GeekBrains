package Units;

import java.util.ArrayList;
import java.util.List;

public abstract class Character implements InGameInterface {
    int initiation;
    int health;
    int baseAttack;
    int baseDefence;
    Coords coords;

    public Character(int initiation, int health, int baseAttack, int baseDefence, int x, int y) {
        this.initiation = initiation;
        this.health = health;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
        this.coords = new Coords(x, y);
    }

    public Coords getCoords() {
        return coords;
    }

    public Character findNearest(List<Character> enemies) {
        Character nearestEnemy = null;
        double minDistance = Integer.MAX_VALUE;
        for (Character enemy : enemies) {
            double distance = calculateDistance(coords, enemy.getCoords());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
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
            System.out.println("For " + char1.getClass().getSimpleName() + " (" + char1.getCoords().getX() + ", " + char1.getCoords().getY() + ")");
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

    public String getInfo() {
        return String.format("%s: health=%d, (%d, %d)", this.getClass().getSimpleName(),
                this.health, this.coords.x, this.coords.y);
    }


}

