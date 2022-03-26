package Lab2;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        /*
        6. Process a string to extract the second word
        - Create a new Java class within the above package - call it Program6
        - Add your public static void main method
        - Add four variables, line and word2. Declare them as Strings
        - Add a variable wordSeparator as an int
        - Declare your scanner object. Call it stringInput
        - Add a line to import the Scanner class.
        - Read in a line of text into variable line adding the trim() method to your usual next___()
        method call to ensure there is no leading space
        - Find the first position of a space character (don't worry about tabs right now) using indexOf as
        we did above and assign the result to wordSeparator
        - Set line to line minus the first word by extracting everything after the first space using the
        substring method from wordSeparator+1 to the end of the line. Dont forget the trim the result
        you assign back to line
        - Repeat the step above to find the next space which will be the end of the second word
        - Use substring again to extract from the start of line to wordSeparator and assign the result to
        word2
        - output a message saying ""<<word2>> is the second word in the line"
         */

        String line;
        String word2;
        int wordSeparator;
        Scanner stringInput = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        line=stringInput.nextLine();
        line=line.trim();
        wordSeparator=line.indexOf(" ");

        line = line.substring((wordSeparator+1));
        line=line.trim();

        wordSeparator=line.indexOf(" ");
        word2 = line.substring(0 ,wordSeparator);

        System.out.println(word2 + " is the second word in the line");

    }
}
