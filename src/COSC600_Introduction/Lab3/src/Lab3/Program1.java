package Lab3;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        // variable declaration
        float itemCost;
        boolean taxCode;
        float finalCost;

        // Input
        Scanner myCostInput = new Scanner(System.in);

        System.out.print("Please enter Item Cost: ");
        itemCost = myCostInput.nextFloat();

        System.out.print("Please enter Tax Code (true/false): ");
        taxCode = myCostInput.nextBoolean();

        // Condition
        if(taxCode)
            finalCost = (float) (itemCost*1.05);
        else
            finalCost=itemCost;

        // Output
        System.out.println("Final cost is: " + finalCost);
    }
}
