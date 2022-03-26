import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        String sLine;
        char sChar;
        int nCount = 0;

        Scanner myStringInput = new Scanner(System.in);

        System.out.print("Enter your String: ");
        sLine = myStringInput.nextLine();

        System.out.print("Enter character: ");
        sChar = myStringInput.nextLine().charAt(0);

        for (int i=0; i<sLine.length() ; i++){
            if (sLine.charAt(i)==sChar)
                nCount++;
        }
        System.out.println(sLine + " has " + nCount + " of "+ sChar);
    }
}