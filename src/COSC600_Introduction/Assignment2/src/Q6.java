import java.util.Scanner;

public class Q6 {


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Please enter a line of input to analyzed: ");
        String input= scanner.nextLine().toLowerCase();

        vowelCalculator(input);

    }
    public static void vowelCalculator(String str) {

        //Variable to save each vowel (aeiouy)
        int aCount=0;
        int eCount=0;
        int iCount=0;
        int oCount=0;
        int uCount=0;
        int yCount=0;

        for (int i=0 ; i<str.length() ; i++) {
            char letter = str.charAt(i);

            switch (letter) {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
                case 'y':
                    yCount++;
                    break;
            }//end of swtich
        }//end of for

        System.out.println("Vowel count: ");
        System.out.println("a  " + aCount);
        System.out.println("e  "+ eCount);
        System.out.println("i  "+ iCount);
        System.out.println("o  "+ oCount);
        System.out.println("u  "+ uCount);
        System.out.println("y  "+ yCount);

    }//end of method
}//end of class


