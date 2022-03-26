package Lab3;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        // Variable
        int inputValue;
        int absValue;

        // Input
        Scanner myAbsInput = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        inputValue= myAbsInput.nextInt();

        // Condition
        //Ternary operator
        absValue=(inputValue>0) ? inputValue : (0-inputValue);

        /* IF-ELSE      if(inputValue>0)
                            absValue=inputValue;
                        else
                            absValue=0-inputValue;  */

        //Output
        System.out.println("The number is: "+ inputValue + " and its absolute value is: " + absValue);

    }
}
