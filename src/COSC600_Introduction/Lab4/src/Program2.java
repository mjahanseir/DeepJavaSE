import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        int decimal;
        String hexVal = "";


        Scanner myDecInput = new Scanner(System.in);
        System.out.print("Enter number: ");
        decimal= myDecInput.nextInt();

        while (decimal !=0){
            int  hexValue = decimal%16;
            char hexDigit = (char) ((0<=hexValue && hexValue<=9)  ? (hexValue+'0') : (hexValue-10+'A'));
            hexVal = hexDigit+hexVal;
            decimal/=16;
        }
        System.out.println(hexVal);
    }
}