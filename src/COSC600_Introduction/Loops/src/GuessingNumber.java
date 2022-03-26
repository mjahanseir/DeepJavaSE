import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {


        int random = (int)(Math.random() * (100+1));

        Scanner scanner= new Scanner(System.in);
        System.out.println(random);
        System.out.println("Guess a magic number between 0 and 100");
        while(true){
            System.out.print("Enter your guess: ");
            int input= scanner.nextInt();
            if(input == random) {
                System.out.println("Great job!");
                break;
            }else if(random - input>10)
                System.out.println("Your guess is too high");
            else if(random - input<10)
                System.out.println("Your guess is too low");

        }
    }
}
