package edu.cscc;

/**
 * Triangle class - derived from Shape
 * @author rplatt
 */
public class Triangle extends Shape {

    private double base;
    private double height;

    // Constructor
    public Triangle(Location loc, String name, double base, double height, String color) {
        super(loc, name, color);
        this.base = base;
        this.height = height;
    }

    // Accessors / Mutators
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Other methods
    public double area() {
        return 0.5 * base * height;
    }
}
