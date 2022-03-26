import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalculatorS1 {
    public static final byte MONTH_YEAR=12;
    public static final byte PERCENT=100;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Principle: ");
        int principle=scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest=scanner.nextFloat();
        float monthlyInterestRate = annualInterest/PERCENT/MONTH_YEAR;

        System.out.print("Period (Years): ");
        byte period=scanner.nextByte();
        int numberOfPayment=period*MONTH_YEAR;

        double mortgage= principle*
                monthlyInterestRate* (Math.pow(1+monthlyInterestRate,numberOfPayment ))
                / (Math.pow(1+monthlyInterestRate,numberOfPayment ))-1;
        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
