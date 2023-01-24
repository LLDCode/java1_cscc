import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String message;
        String firstName;
        String lastName;
        int hour, minute;
        message = "hello";
        hour = 11;
        minute = 59;
        String firstLine = "Hello again!";
        System.out.print("The value of firstLine is ");
        System.out.println(firstLine);
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
        System.out.print("Number of minutes since midnight is ");
        System.out.println(hour * 60 + minute);
        double y = 1.0 / 3.0; // 1/3 is not okay becuase it will do integer division first and then turn it into a float,
        // do not do that, it will not work. Make them a float originally
        System.out.println(y);
    }
}