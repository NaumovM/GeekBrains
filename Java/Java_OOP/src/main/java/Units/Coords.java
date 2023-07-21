package Units;

import java.lang.annotation.Target;
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
        if (Math.abs(this.x - targetX) > Math.abs(this.y - targetY)) {
            if (targetX > this.getX()) {
                this.x++;
            } else {
                this.x--;
            }
        } else {
            if (targetY > this.getY()) {
                this.y++;
            } else if (targetY < this.getY()) {
                this.y--;
            }
        }
    }


    public boolean isEqual(Coords coordinates) {
        return this.y == coordinates.y && this.x == coordinates.x;
    }


    public boolean isAdjacent(Coords targetCoords) {
        int targetX = targetCoords.getX();
        int targetY = targetCoords.getY();

        int dx = Math.abs(targetX - this.x);
        int dy = Math.abs(targetY - this.y);

        return (dx == 1 && dy == 0) || (dx == 0 && dy == 1);
    }


}
