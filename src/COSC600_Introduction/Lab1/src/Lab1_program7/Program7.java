package Lab1_program7;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        /*
        Exercise 7. Write a program to input a decimal number, multiply it by 10 and output the result.
        - Create a new package - call it Lab1_program7
        - Create a new Java class within the above package - call it Program7
        - Add your public static void main method
        - Add two variables, inputNum and result. Declare them as float
        - Declare your scanner object. Call it numInput
        - Add a line to import the Scanner class.
        - use numInput to assign the value of inputNum - note the required output below
        - assign result as the product of firstNum and 10
        - output the result as below ensuring that all vavriables are part of the output using the
        concatenation operator.
        Correct Output:
        Input number: 25.5
        Product : 25.5 x 10 = 255
         */
        float inputNum;
        float result;

        Scanner numInput= new Scanner(System.in);
        System.out.print("Input number: ");
        inputNum =numInput.nextFloat();

        result = inputNum * 10;
        System.out.println("Product : " + inputNum + " x 10 = " + (int)result);

    }
}
