import java.util.Scanner;
public class Echo {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Type something here ");
        line = in.nextLine();
        System.out.println("You said " + line);

        int inch;
        double cm;
        final double cmPerInch = 2.54;
        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * cmPerInch;
        System.out.print(inch + " in = ");
        System.out.println(cm + "cm");

        System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
        System.out.println();
        System.out.printf("%d in = %f cm\n", inch, cm);


        double pi = 3.14159;
        int x = (int) pi; // This is a cast to vonvert a float to a integer
        System.out.println(x);
        // % is remainder/modulus operator, works to find what is left over
        // ex 5 % 3 is 2 because 3 goes into 5 once with a remainder of 2

        int age;
        String name;
        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine(); // read the newline, this line is needed to avoid bug
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

    }
}
