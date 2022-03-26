package Lab3;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        // variable declaration
        int age;

        // Input
        Scanner myAgeInput=new Scanner(System.in);

        System.out.print("Enter your age: ");
        age=myAgeInput.nextInt();

        // Condition and  Outputs
        if( age < 0 || age > 120 )
            System.out.println("The age must be between 0 and 120!");
        else if ( age < 13 )
            System.out.println("child");
        else if ( age >= 13 && age <= 17 )
            System.out.println( "teenager");
        else if( age >= 18 && age <= 65 )
            System.out.println("adult");
        else
            System.out.println("senior");

    }
}
