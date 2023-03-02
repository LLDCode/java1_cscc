package edu.cscc;

/**
 * Shape class
 * @author rplatt
 */
public class Shape {
    private Location loc;
    private String name;
    private String color;

    // Constructor
    public Shape(Location loc, String name, String color) {
        this.loc = loc;
        this.name = name;
        this.color = color;
    }

    // Accessors / Mutators
    public Location getLoc() { return loc; }
    public String getName() { return name; }
    public void setLoc(Location loc) { this.loc = loc; }
    public void setName(String name) { this.name = name; }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Other methods
    public String toString() {
        return("Shape named "+getName()+" at "+loc.toString() + " with color " + getColor());
    }
}
