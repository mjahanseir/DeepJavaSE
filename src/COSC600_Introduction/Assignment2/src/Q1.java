package COSC600_Introduction.Assignment2.src;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        //Variables
        String input;
        //Scanner
        Scanner scanner= new Scanner(System.in);
        System.out.print("What string would you like processed? ");
        input=scanner.nextLine().toUpperCase();
        displaySequence(input);
    }
    //create method for changing string to digit ,also we can write in main body
    public static String displaySequence(String str){
        //2 variable for storing each character of input and create a digit sequence
        char currentCharacter=' ';
        String sequence="";
        //provide first sentences of output
        System.out.print("Phone #sequence: ");
        //loop for reading each character
        for (int i=0 ; i<str.length() ; i++){
            currentCharacter=str.charAt(i);
            // checking letter with corresponding digit
            switch (currentCharacter){
                case ' ':
                    sequence += 1;
                    break;
                case 'A':
                case 'B':
                case 'C':
                    sequence+=2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    sequence+=3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    sequence+=4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    sequence+=5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    sequence+=6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sequence+=7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    sequence+=8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sequence+=9;
                    break;
                default:
                    sequence+=0;

            }
        }
        return sequence;
    }
}