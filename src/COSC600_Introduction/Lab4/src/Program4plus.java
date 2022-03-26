import java.util.Scanner;

public class Program4plus {
    public static void main(String[] args) {

        String sString;
        int nDupOccurances=1;

        Scanner myStringInput = new Scanner(System.in);

        System.out.print("Enter your String: ");
        sString = myStringInput.nextLine();

        /** External loop for tracking input and check null and skip the null input*/
        for (int i=0; i<sString.length();  i++){
            char  firstCharacter= sString.charAt(i);

            if(firstCharacter==' ')
                continue;

            /** internal loop for checking characters */
            for (int j=i+1 ; j<sString.length(); j++){
                char secondCharacter=sString.charAt(j);
                if(firstCharacter== secondCharacter){
                    nDupOccurances++;
                }
            }
            /** deleting repeated character by replacing with null and skip null in third and forth commands of external loop */
            sString=sString.replace(sString.charAt(i), ' ');

            System.out.println("\'"+firstCharacter+ "\' : "+(nDupOccurances));
            nDupOccurances = 1;
        }
    }
}
