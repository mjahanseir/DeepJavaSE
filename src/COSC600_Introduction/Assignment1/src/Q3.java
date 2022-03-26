import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        Write a program that reads in a double value in pounds and converts
        it to kilograms. The formula for the conversion is
        Kilograms = Pounds * 0.454
        Print your result with 2 decimal places

*/
        //Variables
        double pounds;
        double kilograms;
        double base=0.454;

        //input
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please Enter pounds: ");
        pounds= scanner.nextDouble();

        //Calculate (Also can define " public static final double pi=3.14;" )
        kilograms = pounds * base;

        //Print  result with 2 decimal places
        System.out.printf("you have %.2f ", kilograms);

    }
}
