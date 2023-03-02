package edu.cscc;

public class Main {
    public static void main(String[] args) {
        Location a = new Location (10, 20);
        Location b = new Location (10, 20);
        Location a_ref = a;

        if (a == b) {
            System.out.println("a==b");
        } else {
            System.out.println("a!=b");
        }
        if (a == a_ref) {
            System.out.println("a==a_ref");
        }
        if (a.equals(b)) {
            System.out.println("a.equals(b)");
        }
        System.out.println("a contains "+a.toString());
    }


}
