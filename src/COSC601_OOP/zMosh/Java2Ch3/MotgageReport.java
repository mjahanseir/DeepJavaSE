package zMosh.Java2Ch3;
import java.text.NumberFormat;

public class MotgageReport {

    private final NumberFormat currency;
    private MotgageCalculator calculator;

    public MotgageReport(MotgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

//        for (double balance : calculator.getRemainingBalance())
//            System.out.println(currency.format(balance));
//    }

//    public void printMortgage() {

        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
