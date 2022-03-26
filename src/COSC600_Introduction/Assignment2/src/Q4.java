import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Please Enter Star date follow by \"Year.Date\" : ");
        String dateInput= scanner.nextLine();

        System.out.println(starDate(dateInput));
    }
    public static String starDate(String date) {
        //control input
        while (date.length()>5 && date.length()<9 ){
            //Variables
            //Calculate year eg: 2258.42 year =2258
            String  year =date.substring(0,4);
            //keep month
            String month = "";
            //Extract day eg: 2258.42 day =42
            int day =Integer.parseInt(date.substring(5));
            //keep calculated day
            int dayCalc = 0;
            //calculate related month and day from day input
            if (day > 0 && day <= 31) {
                month = "January";
                dayCalc = day;
            } else if (day <= 59) {
                month = "February";
                dayCalc = day - 31;

            } else if (day <= 90) {
                month = "March";
                dayCalc = day - 59;

            } else if (day <= 120) {
                month = "April";
                dayCalc = day - 90;

            } else if (day <= 151) {
                month = "May";
                dayCalc = day - 120;

            } else if (day <= 181) {
                month = "Jun";
                dayCalc = day - 151;

            } else if (day <= 243) {
                month = "August";
                dayCalc = day - 181;

            } else if (day <= 273) {
                month = "September";
                dayCalc = day - 243;

            } else if (day <= 304) {
                month = "October";
                dayCalc = day - 273;

            } else if (day <= 334) {
                month = "November";
                dayCalc = day - 304;

            } else if (day <= 366) {
                month = "December";
                dayCalc = day - 334;

            } else
                System.out.println("Invalid data");

            return month + " " + dayCalc + ", " + year;
        }
        return "Invalid input";
    }
}
