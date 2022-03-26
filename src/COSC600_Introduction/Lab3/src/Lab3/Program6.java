package Lab3;

import java.util.Scanner;

public class Program6 {
    //Constants
    // Character codes for seating levels
    public static final char FIELD = 'f';
    public static final char MEZZANINE = 'm';
    public static final char UPPER = 'u';
    // Character codes for opponent categories
    public static final char PLATINUM = 'p';
    public static final char GOLD = 'g';
    public static final char SILVER = 's';
    public static final char BRONZE = 'b';

    public static void main(String[] args) {

        // variable
        char seatingLevel;  // seating level
        char oppCategory;   //opponent category
        int ticketPrice;   //ticket price

        // Input
        Scanner myGameInput = new Scanner(System.in);

        System.out.print("Please enter your seating level:  " +
                "\n   FIELD = 'f' " +
                "\n   MEZZANINE = 'm' " +
                "\n   UPPER = 'u' " +
                "\n(f / m / u) : ");
        seatingLevel = myGameInput.nextLine().toLowerCase().charAt(0);

        if (!(seatingLevel == 'f' || seatingLevel == 'm' || seatingLevel == 'u')) {
            seatingLevel = UPPER;
            System.out.println("this is done");
        }

        System.out.print("Please enter your opponent category:  " +
                "\n    PLATINUM = 'p' " +
                "\n    GOLD = 'g' " +
                "\n    SILVER = 's' " +
                "\n    BRONZE = 'b' " +
                "\n(p / g / s / b) : ");
        oppCategory = myGameInput.nextLine().toLowerCase().charAt(0);

        // Conditions
        if (seatingLevel == FIELD) {
            if (oppCategory == PLATINUM)
                ticketPrice = 77;
            else if (oppCategory == GOLD)
                ticketPrice = 67;
            else if (oppCategory == SILVER)
                ticketPrice = 62;
            else
                ticketPrice = 57;
        } else if (seatingLevel == MEZZANINE) {
            if (oppCategory == PLATINUM)
                ticketPrice = 54;
            else if (oppCategory == GOLD)
                ticketPrice = 48;
            else if (oppCategory == SILVER)
                ticketPrice = 45;
            else
                ticketPrice = 42;
        } else {
            if(oppCategory == PLATINUM)
                ticketPrice = 35;
            else if (oppCategory == GOLD)
                ticketPrice = 31;
            else if (oppCategory == SILVER)
                ticketPrice = 29;
            else
                ticketPrice = 27;
        }

        //Output
        System.out.println("The ticket price is: "+ ticketPrice);
    }
}
