import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        Write a program that reads in a four-digit number and
        sums up all the digits in the number.
        For example, 4351 would add up to 13
        (Hint: you’ll need to use the modulus operation for this)
        */
        //Variables
        int numberInput;
        int sum=0;

        //input
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please Enter Four-Digit: ");
        numberInput= scanner.nextInt();

        System.out.print("Sum of "+ numberInput + " is: ");

        sum+=numberInput%10;
        numberInput/=10;

        sum+=numberInput%10;
        numberInput/=10;

        sum+=numberInput%10;
        numberInput/=10;

        sum+=numberInput%10;
        System.out.print( sum);


    }
}
