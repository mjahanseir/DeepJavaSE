import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        int n1,n2;
        Scanner myNumInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        n1=myNumInput.nextInt();

        System.out.print("Enter second number: ");
        n2=myNumInput.nextInt();

        int gcd=1;
        int k=2;
        while (k<=n1 && k<=n2){
            if(n1%k==0 && n2%k==0)
                gcd=k;
            k++;
        }
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 +  " is: " + gcd);
    }
}