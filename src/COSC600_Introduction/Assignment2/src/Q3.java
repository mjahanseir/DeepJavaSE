import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        //Variables
        String input;
        //Scanner
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a Base 13 number up to 5 digits: ");
        input=scanner.nextLine().toUpperCase();

        base13Calculator(input);

    }

    /*
    (37A)Base13  = (3*13^2)    +      (7*13^1)        +    (10*13^0)      = (3*169)  + (7*13)  + (10*1)
            (3*Math.pow(13,2)) +   (7*Math.pow(13,1)) +(7*Math.pow(13,1))
     */
    public static void base13Calculator(String input) {

        int calc=0;
        int length=input.length()-1;
        for(int i = 0; i<input.length() ; i++ )
        {
            char character = input.charAt(i);
            switch (character){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    calc = calc +
                            Integer.parseInt(Character.toString(character))*
                                    (int)Math.pow(13,length);
                    length--;
                    break;
                case 'A':
                    calc = calc + 10 * (int)Math.pow(13,length);
                    length--;
                    break;
                case 'B':
                    calc = calc + 11 * (int)Math.pow(13,length);
                    length--;
                    break;
                case 'C':
                    calc = calc + 12 * (int)Math.pow(13,length);
                    length--;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        System.out.println("The decimal number for " + input + " is " +calc);
    }
}
