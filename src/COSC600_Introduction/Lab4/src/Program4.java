import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        String sString;
        int nDupOccurances=0;

        Scanner myStringInput = new Scanner(System.in);

        System.out.print("Enter your String: ");
        sString = myStringInput.nextLine();

        for (int i=0; i<sString.length()-1 ; i++){
            if(sString.charAt(i)==sString.charAt(i+1)){
                nDupOccurances++;
            }
        }
        System.out.println(sString+" has  "+nDupOccurances + " Duplicate");
    }
}