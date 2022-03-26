package Lab2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        /*
        3. Output the inputted value as different results using different Math methods.
            - Create a new Java class within the above package - call it Program3
            - Add your public static void main method
            - Add four variables, val1, val2, val3, val4. Declare them as doubles
            - Declare your scanner object. Call it myDoubleInput
            - Add a line to import the Scanner class.
            - use myDoubleInput to assign the value of val1, val2, val3, val4 using nextDouble()
            Add System.out.println to output :
            ___ rounded up is ___ -->> ceil()
            ___ Rounded down is ___ -->> floor()
            The min value of 2 and 8 is ___ -->> min()
            The min value of 2.0 and 8.0 is ___ -->> min()
            The abslote value of -55 is ___ -->> abs()
            where the blanks will be replaced with your variables and the method calls
         */

        double val1;
        double val2;
        double val3;
        double val4;

        Scanner myDoubleInput=new Scanner(System.in);
        System.out.print("Enter your First number: ");
        val1= myDoubleInput.nextDouble();
        System.out.print("Enter your Second number: ");
        val2= myDoubleInput.nextDouble();
        System.out.print("Enter your Third number: ");
        val3= myDoubleInput.nextDouble();
        System.out.print("Enter your Forth number: ");
        val4= myDoubleInput.nextDouble();

        System.out.println(
                        val1 + " rounded up is "   + Math.ceil(val1)    + "\n" +
                        val1 + " Rounded down is " + Math.floor(val1)   + "\n" +


                        "The min value of "+ val2 + " and " + val3 + " is "+ Math.min(val2,val3)  +  "\n" +
                        "The max value of "+ val2 + " and " + val3 + " is "+ Math.max(val2,val3)  +  "\n" +

                        "The absolute value of "+ val4 + " is  "+ Math.abs(val4));

    }
}
