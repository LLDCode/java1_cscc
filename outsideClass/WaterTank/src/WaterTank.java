public class WaterTank {
    // Levi Lorenzo Diaz - 2/24/2023 - This is to simulate the amount of water in a tank measured in gallons
    private int current;
    private int maxCapacity;

    public WaterTank(int current, int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.current = current;
        if (this.current > this.maxCapacity) {
            this.current = this.maxCapacity;
        }
    }

    public int getCurrent() {
        return current;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void add(int volume) {
        current = volume + current;
        if (current > maxCapacity) {
            current = maxCapacity;
        }
    }

    public void drain(int volume) {
        current = current - volume;
        if (current < 0) {
            current = 0;
        }
    }

    //void print() – prints the current volume of the tank (in gallons)
    public void print() {
        System.out.println("Current amount in the tank is " + current);
    }

    public static void main(String[] args) {
        WaterTank newWaterTank = new WaterTank(350, 300);
        newWaterTank.print();
        newWaterTank.add(100);
        newWaterTank.drain(180);
        newWaterTank.print();
        newWaterTank.add(60);
        newWaterTank.drain(200);
        newWaterTank.print();
        newWaterTank.drain(50);
        newWaterTank.add(375);
        newWaterTank.drain(142);
        newWaterTank.print();
    }
}