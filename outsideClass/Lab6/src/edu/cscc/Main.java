package edu.cscc;

// Levi Lorenzo Diaz - 3/2/23 - TODO Add student name, date, purpose of program
public class Main {

    static Car[] carFleet = {
            /* TODO - uncomment gasoline cars
            new GasolineCar("Toyota", "Rav4", 2015, 4, 15.5),
            new GasolineCar("Ford", "F-150", 2017, 6, 20.1),
            new GasolineCar("Honda", "Civic", 2012, 4,  12.4),
             ***/

            /* TODO - uncomment electric cars
            new ElectricCar("Tesla", "Model 3", 2020, 55),
            new ElectricCar("Tesla", "Model Y", 2021, 58),
            new ElectricCar("Aston Martin", "Rapide E", 2020, 65)
             ***/
    };

    public static void main(String[] args) {
        System.out.println("*** Our Car Fleet ***");

        if (carFleet.length > 0) {
            int vehno = 1;
            for (Car car : carFleet) {
                System.out.println("--- Vehicle #" + vehno + " ---");
                car.describe();
                vehno++;
            }
        }
    }
}

/*
 * Copyright Notice: Columbus State Community College and its employees hold the copyright for this course material. This material is
 * made available to students for their personal use only and may not be distributed for commercial purposes without the College’s
 * express written consent. Uploading this copyrighted material to "tutoring" or other non-Columbus State web sites is prohibited and
 * may result in referral to the Office of Student Conduct and disciplinary action up to and including dismissal.
 *
 * Course ID: 40A9B085A383430396E7BACF467DE6E0
 */
