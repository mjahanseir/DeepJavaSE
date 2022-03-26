import java.util.Scanner;

public class Q7 {

    public static final double GST=0.05; //%5
    public static final double PST=0.06;//%6

    public static void main(String[] args) {
        /*
        Write a program that gives the total tax owing on a purchase you make.
        This calculation is subject to the following conditions:
            1. Taxes are paid at a rate of 5% for GST and 6% PST.
            2. Some individuals are GST Exempt and food is PST exempt.
        Your program should ask for:
            1. the total purchase price of items you are purchasing
            2. whether the purchase is made for an individual who is GST exempt
            3. if the purchase is for food.
        Your program will then output the amount for each of the two taxes, the total taxes and the
        overall total (purchase + all taxes).

*/
        double pstCalculation =0;
        double gstCalculation=0;
        double totalPurchase=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Total Purchase Price: ");
        double purchase=scanner.nextDouble();

        System.out.print("Is the purchase is food? (Yes/No): ");
        char food=scanner.next().charAt(0);

        System.out.print("Is the Customer is Exempt?(Yes/No): ");
        char exemptCustomer=scanner.next().charAt(0);

        if(food=='Y' || food=='y'){
            gstCalculation=purchase * GST;
            totalPurchase= purchase+gstCalculation;
        }else if(exemptCustomer=='Y'|| exemptCustomer=='y') {
            pstCalculation = purchase * PST;
            totalPurchase= purchase+pstCalculation;
        }else {
            gstCalculation = purchase * GST;
            pstCalculation = purchase * PST;
            totalPurchase= purchase+ pstCalculation + gstCalculation;
        }

        System.out.println("\t ----------------------------");
        System.out.printf("Purchase is: $%.2f" , purchase);
        System.out.printf("\n  GST is: $%.2f", gstCalculation);
        System.out.printf("\n  PST is: $%.2f", pstCalculation);
        System.out.println("\n\t ----------------------------");
        System.out.printf("Total is: $%.2f", totalPurchase);

    }
}
