package Lab1_program6;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        /*
        Exercise 6. Write a program that prompts the user to input two numbers and displays the product of them.
        - Create a new package - call it Lab1_program6
        - Create a new Java class within the above package - call it Program6
        - Add your public static void main method
        - Add three variables, firstNum, secondNum and result. Declare them as int
        - Declare your scanner object. Call it myInput
        - Add a line to import the Scanner class.
        - use myInput to assign the value of firstNum - note the required output below
        - use myInput to assign the value of secondNum - note the required output below
        - assign result as the product of firstNum and secondNum
        - output the result as below ensuring that all variables are part of the output using the
        concatenation operator.
        Correct Output:
        Input first number: 25
        Input second number: 5
        Product : 25 x 5 = 125
         */
        int firstNum;
        int secondNum;
        int result;

        Scanner myInput= new Scanner(System.in);
        System.out.print("Input first number: ");
        firstNum =myInput.nextInt();

        System.out.print("Input second number: ");
        secondNum =myInput.nextInt();

        result = firstNum * secondNum;

        System.out.println("Product : " + firstNum + " x " + secondNum + " = " + result);

    }
}
