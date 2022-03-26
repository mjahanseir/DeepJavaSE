package Lab2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {


    /*
    2. Output the inputted value as different results using different Math methods.
        - Create a new Java class within the above package - call it Program2
        - Add your public static void main method
        - Add three variables, firstNum, exp, resultExp, resultLog, resultRoot, Declare them as int, int,
        double, double, double respectively
        - Declare your scanner object. Call it myInput
        - Add a line to import the Scanner class.
        - use myInput to assign the value of firstNum and exp using nextInt()
        - calculate the values of the three result variables as follows:
        resultExp -> use pow() with firstNum and exp
        resultLog -> use log10() with firstNum
        resultRoot -> use sqrt() with firstNum
        Add System.out.println to output :
        ___ Raised to the ____ power is ____
        The log of ____ is ____
        The square root of ____ is ____
        where the blanks will be replaced with your variables
     */
        int firstNum;
        int exp;
        double resultExp;
        double resultLog;
        double resultRoot;
        Scanner myInput = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        firstNum = myInput.nextInt();
        System.out.print("Please enter your exponential: ");
        exp = myInput.nextInt();
        resultExp= Math.pow(firstNum,exp);
        resultLog= Math.log10(firstNum);
        resultRoot= Math.sqrt(firstNum);
        System.out.println(firstNum + " Raised to the " + exp +  " power is " + resultExp+
                "\n The log of "+ firstNum + " is " + resultLog +
                "\n The square root of " + firstNum +" is " + resultRoot );
    }
}
