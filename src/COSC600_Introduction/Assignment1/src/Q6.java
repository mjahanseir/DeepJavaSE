import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        Write a program which will calculate the compound interest of an
         investment given a set of
        parameters:
        P = principal amount of investment
        T = number of years
        R = interest rate à convert to decimal rate r
        n = number of compounding frequencies per year. n would be 1 for annually, 4 for quarterly and
        12 for monthly. For this question, assume monthly.
        Your program will prompt the user to input P, T and R and calculate and output the resulting
        compound interest
         */

        //Variables
        int n=12;
        double compoundInterest;

        //input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal amount of investment: ");
        int P = scanner.nextInt();

        System.out.print("Period (Years): ");
        byte T = scanner.nextByte();

        System.out.print("Interest Rate: ");
        double R = scanner.nextDouble();
        double r = R/12/100; // Monthly Interest Rate

        // Calculate
        compoundInterest = P * (Math.pow(1+(r/n) , n*T));

        System.out.printf("The compound interest is: $%.2f", compoundInterest);
    }
}
