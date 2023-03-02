package edu.cscc;

public class GasolineCar extends Car {
    private int cylinder;
    private double tankCapacity;

    public GasolineCar(String make, String model, int year, int cylinder, double tankCapacity) {
        super(make, model, year);
        this.cylinder = cylinder;
        this.tankCapacity = tankCapacity;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void describe() {
        super.describe();
        System.out.println("Cylinders: " + this.cylinder +
                "\nTank capacity: " + this.tankCapacity + " Gallons");
    }
}
