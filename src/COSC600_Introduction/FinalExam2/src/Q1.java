
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

       /*
        Write a program that will input integer numbers from the console repeatedly,
        one at a time, until a 0 is entered.
        the user enters these numbers, your program is to keep track of the largest odd and the largest
        even numbers entered including how many of each were entered.
        You should have variables for keeping track of both of the largest even/odd numbers and the number
        of times each occurs in the input stream.
        Suppose, for example, the user entered the following numbers, one at a time:

        4  7  2  9  4  6  12  7  9  4  3  6  8  3  12  5  0
        1  2  3  4  5  6   7  8  9  10 11 12 13 14  15 16 17

        Your program should produce the following:
        The largest odd number is 9 which occurred 2 times.
        The largest even number is 12 which occurred 2 times.
        */

        //Variables
        int input;
        int oddMax=0;
        int evenMax=0;
        int countOddMax=0;
        int countEvenMax=0;
        int count=0;

        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter number (0 for exit) : ");

        while (true) {
            input = scanner.nextInt();
            if (input==0)
                break;
            if (count%2!=0){
                if(oddMax<input) {
                    oddMax = input;
                    if(oddMax==input)
                        countOddMax++;
                }
            }else if (count%2==0) {
                if (evenMax < input) {
                    evenMax = input;
                    if(evenMax==input)
                        countEvenMax++;
                }
            }
            count++;
        }
        System.out.println("The largest odd number is " + oddMax+" which occurred "+ countOddMax +" times.");
        System.out.println("The largest even number is " + evenMax+" which occurred "+ countEvenMax+ " times.");
    }
}