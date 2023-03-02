package edu.cscc;

/**
 * Location class - store x, y location
 *
 * @author yournamehere
 */
public class Location {
    private int x, y;

    // Constructor
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Accessors / Mutators
    public int getX() {
        return (x);
    }

    public int getY() {
        return (y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Other methods
    public boolean equals(Location aloc) {
        if ((x == aloc.getX()) && (y == aloc.getY())) {
            return (true);
        } else {
            return (false);
        }
    }

    public String toString() {
        return ("(" + x + "," + y + ")");
    }
}
