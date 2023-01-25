

import java.util.Scanner;
import java.lang.Math;
/*Levi Lorenzo Diaz, 1/24, the purpose of this program is to find distance
and velocity based on the user inputted time in seconds*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double distance, velocity, time;
        final double acceleration = 32.0; //a is acceleration constant of 32.0
        // distance= 1/2 * acceleration * (time * time)
        //velocity = acceleration * time
        System.out.print("Insert time in seconds of free fall: ");
        time = in.nextDouble();
        System.out.println("You said " + time + "seconds");
        distance = (1.0/2.0) * acceleration * (time * time);
        System.out.println("distance: " + distance + " feet");
        velocity = acceleration * time;
        System.out.println("Velocity: " + velocity + " feet/second");

    }
}