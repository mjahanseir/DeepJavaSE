package Lab3;

import java.util.Scanner;

public class Program4 {

    //Constants
    public static final String MONDAY_SPECIAL = "Lasagna";
    public static final String TUESDAY_SPECIAL = "Fish and chips";
    public static final String WEDNESDAY_SPECIAL = "Meat loaf";
    public static final String THURSDAY_SPECIAL = "Beef dip";
    public static final String FRIDAY_SPECIAL = "Chicken strips";
    public static final String SATURDAY_SPECIAL = "Dry ribs";
    public static final String SUNDAY_SPECIAL = "Turkey";

    public static void main(String[] args) {

        // Variable
        String day;

        // Input
        Scanner myDayInput = new Scanner(System.in);
        System.out.print("Please enter day: ");
        day=myDayInput.nextLine().toUpperCase();

        // Condition and Outputs
        if(day.equals("MONDAY"))
            System.out.println("Daily special: " + MONDAY_SPECIAL );
        else if(day.equals("TUESDAY"))
            System.out.println("Daily special: " + TUESDAY_SPECIAL);
        else if(day.equals("WEDNESDAY"))
            System.out.println("Daily special: " + WEDNESDAY_SPECIAL);
        else if(day.equals("THURSDAY"))
            System.out.println("Daily special: " + THURSDAY_SPECIAL);
        else if(day.equals("FRIDAY"))
            System.out.println("Daily special: " + FRIDAY_SPECIAL);
        else if(day.equals("SATURDAY"))
            System.out.println("Daily special: " + SATURDAY_SPECIAL);
        else if(day.equals("SUNDAY"))
            System.out.println("Daily special: " + SUNDAY_SPECIAL);
        else
            System.out.println("You entered an invalid day code!");

    }
}
