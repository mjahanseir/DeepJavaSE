import java.util.Locale;
import java.util.Scanner;

public class Exer42 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter : ");
        String s1=scanner.nextLine();

        System.out.print("Enter : ");
        String s2=scanner.nextLine();

        System.out.print("Enter : ");
        String s3=scanner.nextLine();


        if (s1.compareTo(s2) > 0) {
            // Swap s1 with s2
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        if (s2.compareTo(s3) > 0) {
            // Swap s2 with s3
            String temp = s2;
            s2 = s3;
            s3 = temp;
        }

        if (s1.compareTo(s2) > 0) {
            // Swap s1 with s2
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        System.out.print("The three cities in alphabetical order are "
                + s1 + " " + s2 + " " + s3);

//        if(inp1.compareTo(inp2)>0){
//            if (inp1.compareTo(inp3)>0)
//                System.out.println(inp1);
//        }else if(inp2.compareTo(inp3)>0){
//
//        }

       /*
        System.out.println("Length: "+ inp.length() + " and first character is: "+ inp.charAt(0));


        char sub= inp.charAt(0);

        char year= inp.charAt(1);

        String subject="";
        String title="";
        switch (sub){
            case 'M': subject="Mathematic"; break;
            case 'C': subject="Computer Science"; break;
            case 'I': subject="Information Technology"; break;
            default:
                subject="invalid input";
        }
        switch (year){
            case '1': title="freshman"; break;
            case '2': title="sophomore"; break;
            case '3': title="junior"; break;
            case '4': title="senior"; break;
            default:
                title="";
        }
        System.out.println(subject+ "  "+ title);

        System.out.println((char)(Math.random() * 26+'A'));
        */



    }
}
