// package edu.cscc; I know I should have this but I get an error on my side when I include this in the code, maybe we can look at it together in class
import java.util.Scanner;
// Levi Lorenzo Diaz- Lab 2 - Take user input and tell what type of hurricane it is based on the Saffir-Simpson hurricane wind scale
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        long speed;
        String classification;
        System.out.print("Input your number");
        speed = input.nextLong();
        System.out.print("Your input was" + speed);

        // TODO - write your program here
    }
}