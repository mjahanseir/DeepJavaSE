import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        /*
        Write a program that will prompt for a type of item and number of days
         late and then calculate the fine that is to be paid.
        */

        //Variables
        double regularFine=0.5;
        double reserveFine=1.0;
        double specialFine=2.0;
        double fineCalculate = 0;
        //input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Item type (Regular / Reserved / Special): ");
        String itemType = scanner.nextLine().toLowerCase().substring(0, 3); // get three first letter and lowercase them for camparison

        System.out.print("Please Enter number of days late: ");
        int dayLate = scanner.nextInt();

        if (dayLate > 0) {          // check to type inputs
            //Regular Fine
            if (itemType.equals("reg"))
                fineCalculate = dayLate * regularFine;
                //Reserved Fine
            else if (itemType.equals("res"))
                fineCalculate = dayLate * reserveFine;
                //Special Fine
            else if (itemType.equals("spe"))
                fineCalculate = dayLate * specialFine;
            else
                System.out.println("Your category is invalid");;
        }//     negative number or invalid number as input
        else
            System.out.println("Your late days is invalid");
        //Check more than $10 ->pay only 10
        if (fineCalculate >= 10.0)
            fineCalculate=10.0;

        System.out.println("Your fine is "+fineCalculate);
    }
}