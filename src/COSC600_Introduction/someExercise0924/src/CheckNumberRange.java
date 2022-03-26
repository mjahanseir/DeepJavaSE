
import java.util.Scanner;

public class CheckNumberRange
{

    /**
     * Purpose:
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        System.out.println("Please enter a number");
        int number = input.nextInt();

        if ( number >= -5 && number <= 5 )
        {
            System.out.println("Number is in range.");
            if ( number >= 0 )
            {
                System.out.println("Number is not negative");
            }
        }

    }

}
