package edu.cscc;
import java.util.Arrays;
import java.util.Scanner;
// Levi Diaz - 2/10/2023 - This program is supposed to be a simple grocery list that allows you to input up to 6 items and they can't be duplicates
public class Main {
    private static Scanner input = new Scanner(System.in); // Allows for user inputs, do variable = input.next...() to have user input

    public static void main(String[] args) {
        int count = 0;// Number of items currently in the grocery list
        String[] foodList = new String[6]; // number of items that can be put in grocery list
        String items = ""; // String fro the users input
        while (count < foodList.length) {
            int userCount = count + 1; // Had a bug when I tried to print user + 1 in the println below, this is the solution
            System.out.println("Please type item #" + userCount + " to add to your list");
            items = input.next(); // asks for user input for the next item in the list
            boolean keepGoing = isDuplicate(items, foodList, foodList.length); // This method tests if the inputted number is already in the Array
            if (keepGoing == true) { // If the method comes back as false that means it's a duplicate, we let the user know and restart the loop before we add to count
                System.out.println("You already have that in your list! Try something else");
                continue; // redoes the loop before the "count++" and before items is put in foodList
            }
            foodList[count] = items; // items put in array after we check if items is a duplicate
            count++; // count increases after we check if items is a duplicate
        }
    }

    /**
     * Checks to see if the list contains a duplicate.
     * @param item The name of an item to check for.
     * @param list The list of items to check against.
     * @param listcnt The count of items in the array.
     * @return `true` if a duplicate is found. `false` otherwise.
     */
    public static boolean isDuplicate(String item, String[] list, int listcnt) { //method to check if item inputted by user is a duplicate, item is the inputted item, list is the array, and listcnt is the amount of items in the array
    for (int i = 0; i < listcnt; i++) { // i increases by one until it is equal to amount in the array
        if (item.equals(list[i])) {
            return true;//Check item with i in list and if it matches other items then return true
        }
    }
    return false; // If the input isn't a duplicate it comes back as true which allows the loop to continue
    }
    }