package Lab2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        /*
        5. Read in a line of text and display the line with the first word moved to the end of the line.
        - Create a new Java class within the above package - call it Program5
        - Add your public static void main method
        - Add four variables, text, index, firstWord and remainder. Declare them as String, int, String,
        String
        - Declare your scanner object. Call it myLineInput
        - Add a line to import the Scanner class.
        - Read in a line of text into variable text
        - Remove any leading or trailing whitespace by calling the trim method on text and assigning
        the result back to itself
        - Find the first space in the line of text and assign the index of it to variable index. That will
        indicate the end of the first word. Remember we use the indexOf() method for this.
        - Use the substring method to extract the first word and assign it to firstWord. You will extract
        from the start of the string to the above index.
        - Use substring again to assign to the remainder variable the rest of the line. You will extract
        starting at index and go to the end of the string
        - Remove the leading space(s) from the rest of the line using the trim method on remainder and
        assign the result back to remainder
        remainder = remainder.trim();
        - Output the line with the first word moved to the end of the line by simply outputting
        remainder concatenated with a space and then firstWord.
        System.out.println( remainder + " " + firstWord );
         */
        String text;
        int index;
        String firstWord;
        String remainder;
        Scanner myLineInput = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        text=myLineInput.nextLine();

        text=text.trim();
        index = text.indexOf(" ");

        if(index >= 0){
            firstWord = text.substring(0, index);

            remainder = text.substring(index, text.length());
            remainder = remainder.trim();

            System.out.println(remainder + " " + firstWord);
        }
        else
            System.out.println(text);

    }
}
