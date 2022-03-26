import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to enter an integer and determines whether it is divisible
        by both 4 and 9, and whether it is divisible by 4 or 9 (either but not both). Two sample runs of
        the program might look like
        Enter an Integer: 12
        12 is Not Divisible by both 4 and 9.
        12 is Divisible by one of 4 or 9
        */


        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter an Integer: ");
        int inputNumber = scanner.nextInt();


        if (inputNumber%4==0 && inputNumber%9==0)
            System.out.println(inputNumber + " is Divisible by both 4 and 9");
        if (inputNumber % 4 == 0 || inputNumber % 9 == 0)
                System.out.println(inputNumber + " is Not Divisible by both 4 and 9\n"+
                                   inputNumber + " is Divisible by one of 4 or 9");
        else
            System.out.println(inputNumber + " is not Divisible by both or one of 4 or 9");
    }
}