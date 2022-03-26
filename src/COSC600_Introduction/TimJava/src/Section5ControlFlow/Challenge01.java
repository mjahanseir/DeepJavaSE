package Section5ControlFlow;

public class Challenge01 {
    public static void main(String[] args) {
        char input='A';
        switch (input){
            case 'A':
            case'B':
            case'C':
            case 'D':
            case 'E':
                System.out.println("found");
                break;
            default:
                System.out.println("Not Found");
                break;

        }
    }
}
