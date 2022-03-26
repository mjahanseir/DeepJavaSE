package Lab1_program5;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        /*
        Exercise 5. Write a program to input a String value and output the value back to the user.
        - Create a new package - call it Lab1_program5
        - Create a new Java class within the above package - call it Program5
        - Add your public static void main method
        - Add a variable, myString, declared as a String type
        - Declare your scanner object. Call it stringInput
        - Add a line to import the Scanner class.
        - use stringInput to assign the value of myString
        - Add a System.out.println to output the value of myString
        Correct Output:
        Input a string: This is a string
        This is a string
         */
        String myString;

        Scanner stringInput= new Scanner(System.in);
        System.out.print("Input a string: ");
        myString=stringInput.nextLine();

        System.out.println(myString);
    }
}
