package edu.cscc;

public class Location {
    private int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Location aloc) {
        return (x == aloc.getX() && y == aloc.getY());
    }

    public String toString() {
        return ("(" + x + "," + y + ")");
    }
}
