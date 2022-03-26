import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
        Write a program to prompt the user to enter a date by providing the month,
        date and year and have your program output the day of the week.
        The difficulty here is getting your formula set up properly in code.
         Operator precedence is very important.

*/
        //input
        Scanner scanner= new Scanner(System.in);

        System.out.print("Please Enter Month:" +
                "\n(1=January,   2=February, 3=March,     4=April, " +
                "\n 5=May,       6=Jun,      7=July,      8=August, " +
                "\n 9=September, 10=October, 11=November, 12=December): ");
        int m= scanner.nextInt();
        System.out.print("Please Enter Day: ");
        int q= scanner.nextInt();

        System.out.print("Please Enter Year: ");
        int j= scanner.nextInt();
        //Calculate
        if(m==1 || m==2) {
            m += 12;
            j--;
        }
        int k= j%100;
        int h= (q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j) % 7;
        switch (h){
            case 0:
                System.out.print("Saturday(0)");
                break;
            case 1:
                System.out.print("Sunday(1)");
                break;
            case 2:
                System.out.print("Monday(2)");
                break;
            case 3:
                System.out.print("Tuesday(3)");
                break;
            case 4:
                System.out.print("Wednesday(4)");
                break;
            case 5:
                System.out.print("Thursday(5)");
                break;
            case 6:
                System.out.print("Friday(6)");
                break;
            default:
                System.out.println("Invalid Data");

        }
    }
}
