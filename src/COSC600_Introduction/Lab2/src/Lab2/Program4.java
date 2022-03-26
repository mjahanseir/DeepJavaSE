package Lab2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        /*
        4. Read in two lines of text. Determine whether the second line is found within the first line,
        displaying the index within the first line at which the second line is found. If the second line is
        not found within the first line, display a value of -1.
        - Create a new Java class within the above package - call it Program4
        - Add your public static void main method
        - Add three variables, line1, line2, index. Declare them as String, String, int
        - Declare your scanner object. Call it myStringInput
        - Add a line to import the Scanner class.
        - Read in a line of text into variable line1
        - Read in another line of text into variable line2
        - use the indexOf() method called on line1 using line2 as a parameter to determine the index of
        the second string within the first. It will return -1 if it finds nothing.
        - You should store the result of the last step in the index variable
        - Output the variable index
         */
        String line1;
        String line2;
        int index;
        Scanner myStringInput = new Scanner(System.in);
        System.out.print("Please enter your First text: ");
        line1= myStringInput.nextLine();
        System.out.print("Please enter your Second text: ");
        line2= myStringInput.nextLine();

        index= line1.indexOf(line2);
        System.out.println(index);

    }
}
