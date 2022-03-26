package Lab3;

import java.util.Scanner;

public class Program5 {

    //Constants
    public static final String MONDAY_SPECIAL = "Lasagna";
    public static final String TUESDAY_SPECIAL = "Fish and chips";
    public static final String WEDNESDAY_SPECIAL = "Meat loaf";
    public static final String THURSDAY_SPECIAL = "Beef dip";
    public static final String FRIDAY_SPECIAL = "Chicken strips";
    public static final String SATURDAY_SPECIAL = "Dry ribs";
    public static final String SUNDAY_SPECIAL = "Turkey";
    //Additional constants
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String[] args) {

        // variable
        int dayNumber;

        // Input
        Scanner myDayNumInput = new Scanner(System.in);

        System.out.print("Enter a day code as follows:" +
                "\n   Monday = " + MONDAY +
                "\n   Tuesday = " + TUESDAY +
                "\n   Wednesday = " + WEDNESDAY +
                "\n   Thursday = " + THURSDAY +
                "\n   Friday = " + FRIDAY +
                "\n   Saturday = " + SATURDAY +
                "\n   Sunday = " + SUNDAY +
                "\nWhat is today's day code (1-7)? ");
        dayNumber = myDayNumInput.nextInt();

        // Condition and output
        switch(dayNumber) {
            case 1:
                System.out.println("Daily special: " + MONDAY_SPECIAL);
                break;
            case 2:
                System.out.println("Daily special: " + TUESDAY_SPECIAL);
                break;
            case 3:
                System.out.println("Daily special: " + WEDNESDAY_SPECIAL);
                break;
            case 4:
                System.out.println("Daily special: " + THURSDAY_SPECIAL);
                break;
            case 5:
                System.out.println("Daily special: " + FRIDAY_SPECIAL);
                break;
            case 6:
                System.out.println("Daily special: " + SATURDAY_SPECIAL);
                break;
            case 7:
                System.out.println("Daily special: " + SUNDAY_SPECIAL);
                break;
            default:
                System.out.println("You entered an invalid day code!");

        }
    }
}
