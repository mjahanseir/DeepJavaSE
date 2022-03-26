import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        /* Write a program to input and then display the following.
        Experiment with the output to have the description and data displayed in two columns.
        Tax code (possible tax code input is P for PST and G for GST)
        Child's age
        Quantity apples sold
        Price of item
         */


        System.out.println("Enter tax code (P)rovincial/(G)ST:  ");
        Scanner scanner =new Scanner(System.in);
        char taxCode = scanner.next().charAt(0);

        System.out.println("Enter age of child: ");
        byte age = scanner.nextByte();

        System.out.println("Enter number of apples sold: ");
        int numApples = scanner.nextInt();

        System.out.println("Enter price of apples sold: ");
        double price = scanner.nextDouble();

        System.out.println("Tax Code \t\t" + taxCode +
                            "\nAge \t\t\t" + age+
                            "\nNumber of Apples \t" + numApples +
                            "\nPrice of Apples \t" + price);
    }
}
