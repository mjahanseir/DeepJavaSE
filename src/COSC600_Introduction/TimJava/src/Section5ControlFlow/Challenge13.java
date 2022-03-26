package Section5ControlFlow;

public class Challenge02 {
    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(2);
        printDayOfTheWeek(8);

    }
    public static void printDayOfTheWeek(int input){
        switch (input){
            case 0 :
                System.out.println("Sun");
                break;
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Not Found");
                break;

        }
    }
}
