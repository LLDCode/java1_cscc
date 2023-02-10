package edu.cscc;
import java.util.Scanner;
// Levi Lorenzo Diaz - 2/3/2023 - The purpose of this program is to calculate the BMI of a person based on their input in standard units of measurements in the United States
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("This is a BMI calculator ");
        callBMI();
    }

    public static void callBMI() {
        double convertedMeters = convertToMeters();
        double convertedKg = convertToKg();
        double BMI = calcBMI(convertedKg, convertedMeters);
        bmiClassification(BMI);
    }
//    public static double convertToMeters(){
//        double inches;
//        double meters;
//        System.out.print("please input your height in inches: ");
//        inches = input.nextDouble();
//        if (inches < 0) {
//            System.out.println("Please enter a non negative number for your height in inches");
//            //convertToMeters(); This does not work, it instead takes my original input and uses it for the variable kilograms, I used exit() to stop the program, please help me fix this
//            System.exit(0);
//        }
//        meters = inches / 39.37;
//        return meters;
//    }
public static double convertToMeters() {
    double inches;
    double meters;
    do {
        System.out.print("please input your height in inches: ");
        inches = input.nextDouble();
        if (inches < 0) {
            System.out.println("Please enter a non negative number for your height in inches");
        }
    } while (inches < 0);
    meters = inches / 39.37;
    return meters;
}


    public static double convertToKg() {
        double pounds;
        double kilograms;
        System.out.print("Please input your weight in pounds: ");
        pounds = input.nextDouble();
        kilograms = pounds /  2.2046;
        if (kilograms < 0) {
            System.out.println("Please input a number that isn't negative for your weight in pounds");
            //convertToKg(); This does not work, it instead takes my original input and uses it for the variable kilograms, I used exit() to stop the program, please help me fix this
            System.exit(0);
        }
        return kilograms;
    }

    public static double calcBMI(double kg, double meters) {
        double metersSquared;
        double BMI;
        metersSquared = meters * meters;
        BMI = kg / metersSquared;
        System.out.printf("Your BMI is %.1f", BMI);
        return BMI;
    }

    public static void bmiClassification(double BMI) {
        if (BMI < 18.5) {
            System.out.println(" You are underweight according to your BMI classification");
        } else if (BMI < 25.0) {
            System.out.println(" You are a normal weight according to your BMI classification");
        } else if (BMI < 30.0) {
            System.out.println(" You are overweight according to your BMI classification, however, you may be at a healthy weight depending on the amount of muscle you have and your genetics");
        } else {
            System.out.println(" You are obese according to your BMI classification, however, you may be at a healthy weight depending on the amount of muscle you have and your genetics");
        }
    }
}