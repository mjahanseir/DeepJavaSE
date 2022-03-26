package Lab1_program9;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        /*
        Exercise 9. Write a program that takes a number as input and outputs its multiplication table up to 10.
            - Create a new package - call it Lab1_program9
            - Create a new Java class within the above package - call it Program9
            - Add your public static void main method
            - Add a variable, multTableNum. Declare it as int
            - Declare your scanner object. Call it myMultInput
            - Add a line to import the Scanner class.
            - use myMultInput to assign the value of multTableNum - note the required output below
            - Add a System.out.println for each line from 1 to 10 to multiply myMultInput by that number.
            - output the results as below ensuring that myMultInput is part of the output using the
            concatenation operator.
            Correct Output :
            Input a number: 5
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            5 x 4 = 20
            5 x 5 = 25
            5 x 6 = 30
            5 x 7 = 35
            5 x 8 = 40
            5 x 9 = 45
            5 x 10 = 50
         */
        int multTableNum;
        Scanner myMultInput= new Scanner(System.in);
        System.out.print("Input number: ");
        multTableNum =myMultInput.nextInt();
        System.out.println("Input a number: " + multTableNum);
        for (int i=1; i<=10 ; i++){
            System.out.println(multTableNum + " x " + i + " = " + multTableNum*i);
        }

    }
}
