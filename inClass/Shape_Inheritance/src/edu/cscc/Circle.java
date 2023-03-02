package edu.cscc;

/**
 * Circle class - derived from Shape
 * @author rplatt
 */
public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(Location loc, String name, double radius, String color) {
        super(loc, name, color);
        this.radius = radius;
    }

    // Accessors / Mutators
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Other methods
    public double area() {
        return Math.PI * Math.pow(radius,2.0);
    }
}
