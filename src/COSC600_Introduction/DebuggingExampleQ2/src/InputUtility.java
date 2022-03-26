/*
 * Date submitted: January 24th, 2011
 * Assignment number: 1
 * Course: COSC 190
 * Instructors: Sharon McDonald
 */



import java.util.Scanner;

/**
 *  Purpose: Utility class with methods to read input.
 *
 * @author Sharon McDonald
 */

public class InputUtility
{
    private static Scanner input = new Scanner( System.in );
    
    /**
     * 
     * Purpose:  Read a String of at least 1 character that may include
     * spaces from the input stream
     * @param prompt    Prompt message to be displayed
     * @return  String read in 
     */
    public static String readString(String prompt)
    {
        System.out.println(prompt);
        String inputStr = input.nextLine();
        while( inputStr.length() == 0 )
        {
            System.out.println("Enter at least 1 character");
            inputStr = input.nextLine();
        }
        return inputStr;
    }
   
    /**
     * 
     * Purpose:  Read in a valid integer from input stream.  The input is checked 
     * for valid numeric integer that falls in the range specified by the 
     * parameters. 
     * @param prompt  Prompt message to be displayed
     * @param low       Low end of the valid range (inclusive)
     * @param high      High end of the valid range(inclusive)
     * @return  valid integer in range specified
     */
    public static int readInt( String prompt, int low, int high )
    {
        int entry = 0;
        boolean noEntryYet = true;
        do
        {
            System.out.print( prompt + " " );
            if (input.hasNextInt())
            {
                entry = input.nextInt();
                if (entry < low || entry > high)
                {
                    System.out.println( "Invalid entry - must be between "
                            + low + " and " + high );
                }
                else
                {
                    noEntryYet = false;
                }
            }
            else
            {
                System.out.println( "Invalid entry" 
                        + " - must be a number, digits only" );
            }
            //Clear out carriage return, valid or invalid
            input.nextLine();
        } while (noEntryYet);
        
        return entry;
    }
    
    /**
     * 
     * Purpose:  Read in a valid float from input stream.  The input is checked 
     * for valid numeric float that falls in the range specified by the 
     * parameters. 
     * @param prompt  Prompt message to be displayed
     * @param low       Low end of the valid range (inclusive)
     * @param high      High end of the valid range(inclusive)
     * @return  valid float value in range specified
     */
    public static float readFloat( String prompt, float low, float high  )
    {
        float entry = 0;
        boolean noEntryYet = true;
        do
        {
            System.out.print( prompt + " " );
            if (input.hasNextFloat())
            {
                entry = input.nextFloat();
                if (entry < low || entry > high)
                {
                    System.out.println( "Invalid entry - must be between "
                            + low + " and " + high );
                }
                else
                {
                    noEntryYet = false;
                }
            }
            else
            {
                System.out.println( "Invalid entry" 
                        + " - must be a number, digits only" );
            }
            //Clear out carriage return, valid or invalid
            input.nextLine();
        } while (noEntryYet);
        
        return entry;
    }
    /**
     * 
     * Purpose:  Read a character value.  The character must be in the list
     * of valid characters specified in the valid chars parameter.
     * @param prompt    Prompt message to be displayed
     * @param validChars    Valid characters
     * @return character read in
     */
    public static char readChar( String prompt, String validChars )
    {
        System.out.println( prompt );
        // using next ensures at least 1 character is read
        char inChar = input.next().toUpperCase().charAt( 0 );
        while( validChars.indexOf( inChar ) == -1 )
        {
            System.out.println("Invalid! Please enter one of \"" + validChars +
                    "\"" );
            inChar = input.next().toUpperCase().charAt( 0 );
        }
        // clear out carriage return so it does not affect a future read
        input.nextLine();
        return inChar;
    }

}
