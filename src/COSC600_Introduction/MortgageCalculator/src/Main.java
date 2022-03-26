import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        final byte MONTH_IN_YEAR =12;
        final byte PERCENT =100;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Principal: ");
        int principal= scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate= scanner.nextDouble();

        System.out.print("Period (Years): ");
        byte period= scanner.nextByte();

        double monthlyInterest =
                annualInterestRate/MONTH_IN_YEAR/PERCENT;
        int numberOfPayment=period*MONTH_IN_YEAR;
        double mortgage =principal*
                (monthlyInterest*(Math.pow((1+monthlyInterest),numberOfPayment)))/
                ((Math.pow((1+monthlyInterest),numberOfPayment))-1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));


    }
}
