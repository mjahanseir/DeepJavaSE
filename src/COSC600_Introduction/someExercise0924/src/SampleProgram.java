import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int hours;

        int remainingMinutes;
        System.out.println("Enter the Number");
        int inputMinutes=scanner.nextInt();
        hours = inputMinutes/60;
        remainingMinutes=inputMinutes%60;
        System.out.println("Time is: ");


    }
}
