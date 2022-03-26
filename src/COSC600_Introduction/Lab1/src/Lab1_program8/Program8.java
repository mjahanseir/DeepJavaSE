package Lab1_program8;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        /*
        Exercise 8. Write a program to input two numbers and then output the sum, product,
            difference, quotient and remainder of the two numbers. Ensure the quotient retains the decimal portion
        - Create a new package - call it Lab1_program8
        - Create a new Java class within the above package - call it Program8
        - Add your public static void main method
         - Add three variables, firstNum, secondNum and result. Declare them as int
        - Declare your scanner object. Call it myCalcInput
         - Add a line to import the Scanner class.
        - use myInput to assign the value of firstNum - note the required output below
        - use myInput to assign the value of secondNum - note the required output below
        - assign result as the sum of firstNum and secondNum
        - assign result as the difference of firstNum and secondNum
        - assign result as the product of firstNum and secondNum
        - assign result as the quotient of firstNum and secondNum
        - assign result as the modulus of firstNum and secondNum
        - output the result as below ensuring that your variables are part of the output using the
        concatenation operator.
        Correct Output:
        Input first number: 25
        Input second number: 5
        25 + 5 = 30
        25 - 5 = 20
        25 x 5 = 125
        25 / 5 = 5
        25 mod 5 = 0
            */
        int firstNum;
        int secondNum;
        int result;

        Scanner myCalcInput= new Scanner(System.in);
        System.out.print("Input first number: ");
        firstNum =myCalcInput.nextInt();

        System.out.print("Input second number: ");
        secondNum =myCalcInput.nextInt();

        result = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + result);

        result = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + result);

        result = firstNum * secondNum;
        System.out.println(firstNum + " x " + secondNum + " = " + result);

        result = firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " = " + result);

        result = firstNum % secondNum;
        System.out.println(firstNum + " mod " + secondNum + " = " + result);

    }
}
