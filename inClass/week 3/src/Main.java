public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double computeArea(double radius) {
        double area;
        area = Math.pow(radius, 2.0) * Math.PI;
        return area;
    }

    public static void printCalcYear(String planetName, double distance) {
        double pyears = Math.sqrt(Math.pow(distance, 3.0));
        System.out.println(planetName+" revolves around the sun once in " + pyears+" Earth years");
    }

}