package Lab3;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {


        // variable declaration
        String name;

        // Input
        Scanner myNameInput =new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name= myNameInput.nextLine().toLowerCase().trim();

        // Condition and outputs
        if( (name.charAt(0)) == (name.charAt(name.length()-1)) )
            System.out.println("Your name has EQUAL first and last character");
        else
            System.out.println("Your name has DIFFERENT first and last character");
    }
}
