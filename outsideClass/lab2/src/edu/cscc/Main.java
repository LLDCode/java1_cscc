package edu.cscc;
import java.util.Scanner;
// Levi Lorenzo Diaz - 11/31 - Lab 2 - Take user input and tell what type of hurricane it is based on the Saffir-Simpson hurricane wind scale
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        long windSpeed;
        System.out.print("Please input the wind speed in Mph for classification ");
        windSpeed = input.nextLong();

        if (windSpeed < 39) {
            System.out.print("Classification: Not in the scale");
        } else if (windSpeed < 74) {
            System.out.print("Classification: Tropical storm");
        } else if (windSpeed < 96) {
            System.out.print("Classification: Category One Hurricane");
        } else if (windSpeed < 111) {
            System.out.print("Classification: Category Two Hurricane");
        } else if (windSpeed < 130) {
            System.out.print("Classification: Category Three Hurricane");
        } else if (windSpeed < 157) {
            System.out.print("Classification: Category Four Hurricane");
        } else {
            System.out.print("Classification: Category Five Hurricane");
        }

        // TODO - write your program here
    }
}