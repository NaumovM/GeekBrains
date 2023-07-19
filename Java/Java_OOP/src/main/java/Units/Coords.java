package Units;

import java.util.ArrayList;

public class Coords {
    int x;
    int y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public double calculateDistance(Coords coords) {
        return Math.sqrt(Math.pow(coords.x - x, 2) + Math.pow(coords.y - y, 2));
    }

    public void stepEnemy(Character nearestEnemy) {
        int targetX = nearestEnemy.coords.getX();
        int targetY = nearestEnemy.coords.getY();
        if (targetX > this.getX()) {
            this.x++;
        } else if (targetX < this.getX()) {
            this.x--;
        }

        if (targetY > this.getY()) {
            this.y++;
        } else if (targetY < this.getY()) {
            this.y--;
        }
    }
    private boolean isOccupied(Coords coords, ArrayList<Character> teamAlly) {
        for(Character ally : teamAlly) {
            if(ally.getCoords().equals(coords)) {
                return true;
            }
        }
        return false;
    }


    public boolean isAdjacent(Coords targetCoords) {
        int targetX = targetCoords.getX();
        int targetY = targetCoords.getY();

        int dx = Math.abs(targetX - this.x);
        int dy = Math.abs(targetY - this.y);

        return (dx == 1 && dy == 0) || (dx == 0 && dy == 1);
    }

//    public int[] step2(Coords enemy) {
//        int[] coord2 = {x, y};
//        if (enemy.y == this.y) {
//            if (enemy.x > this.x) coord2[0] += 1;
//            else coord2[0] -= 1;
//        } else {
//            if (enemy.y > this.y) coord2[0] += 1;
//            else coord2[1] -= 1;
//        }
//        return coord2;
//    }


}
