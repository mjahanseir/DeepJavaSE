import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Write a program that acts like a simple finance calculator.
        The program will prompt the user for a particular operation
        according to the following list and then prompt the user for
        any necessary input values.
        Assume two decimal places for results and use proper types

*/
        Scanner scanner= new Scanner(System.in);

        //////////////  Net Income //////////////////
        //Variables
        double netIncome;
        double revenues;
        double expenses;
        System.out.print("Please Enter your Revenues: ");
        revenues=scanner.nextDouble();
        System.out.print("Please Enter your Expenses: ");
        expenses=scanner.nextDouble();

        //Equation: Net Income = Revenues – Expenses
        netIncome = revenues-expenses;

        if(netIncome<0)
            System.out.printf("your business is in its beginning stage and your net income is %.2f", netIncome);
        else
            System.out.printf("your business’ net income is: %.2f, meaning your business is profitable" , netIncome);

        System.out.println("\n\t **************************");

        //////////////  Break-Even Point //////////////////
        double breakEven;
        double fixedCost;
        double salesPrice;
        double costPerUnit;

        System.out.print("Please Enter your Fixed Cost: ");
        fixedCost=scanner.nextDouble();
        System.out.print("Please Enter your Sales Price: ");
        salesPrice=scanner.nextDouble();
        System.out.print("Please Enter your Variable Cost Per Unit: ");
        costPerUnit=scanner.nextDouble();

        //Equation: Break-Even Point = Fixed Costs / (Sales Price – Variable Cost Per Unit)
        breakEven=fixedCost/(salesPrice-costPerUnit);

        if (breakEven<0)
            System.out.printf("You need to sell :%.2f, in order to cover all of your costs", (breakEven*(-1)));
        else
            System.out.printf("Your Break-Even Point: %.2f", breakEven );

        System.out.println("\n\t **************************");

        //////////////  Cash Ratio  //////////////////
        double cashRatio;
        double cash;
        double currentLiabilities;

        System.out.print("Please Enter how much cash you currently have on hand: ");
        cash=scanner.nextDouble();
        System.out.print("Please Enter the current debts the business has incurred: ");
        currentLiabilities=scanner.nextDouble();

        //Equation: Cash Ratio = Cash / Current Liabilities
        cashRatio= cash/currentLiabilities;

        System.out.printf("Your Cash ratio is %.2f " +
                "\nHigher the number, the healthier your company. The ratio is not a money value" , cashRatio);


        System.out.println("\n\t **************************");


        ////////////// Profit Margin  //////////////////
        double profitMargin;
        double sales;

        System.out.print("Please Enter the total amount of sales you’ve generated: ");
        sales=scanner.nextDouble();

        profitMargin=netIncome/sales*100;
        System.out.print("Your Profit Margin is %"+ (int)profitMargin);

        System.out.println("\n\t **************************");

        ////////////////   Debt-to-Equity Ratio
        double totalLiabilities;
        double totalEquity;
        double debtToEquityRatio;

        System.out.print("Please Enter all costs you must pay to outside parties, such as loan or interest payments: ");
        totalLiabilities=scanner.nextDouble();
        System.out.print("Please Enter how much of the company actually belongs to the owner or other employees");
        totalEquity=scanner.nextDouble();

        // Equation: (Debt-to-Equity Ratio = Total Liabilities / Total Equity)
        debtToEquityRatio=totalLiabilities/totalEquity;

        System.out.printf("Your Debt-to-Equity Ratio is %.2f", debtToEquityRatio);
    }
}
