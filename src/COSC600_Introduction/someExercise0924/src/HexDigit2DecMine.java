import java.util.Scanner;

public class HexDigit2DecMine {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter a digit: ");
        String inputString= scanner.next();
        if (inputString.length()!=1) {
            System.out.println("enter only 1");
            System.exit(1);
        }
        char ch= Character.toUpperCase(inputString.charAt(0));

        if(ch>='A'&& ch <='F'){
            System.out.println(ch - 'A' +10);
        }else if(ch<10)
            System.out.println(ch);
        else
            System.out.println("invalid");


    }
}