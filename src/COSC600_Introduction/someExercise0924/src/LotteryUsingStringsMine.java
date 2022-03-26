import java.util.Scanner;

public class LotteryUsingStringsMine {

    public static final int SAME_DIGIT_GIFT=10000;
    public static final int TWO_DIGIT_GIFT=3000;
    public static final int ONE_DIGIT_GIFT=1000;

    public static void main(String[] args) {

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int randomMaker= (int)(Math.random()*100);

        int randomMakerNumber1= randomMaker/10;
        int randomMakerNumber2= randomMaker%10;


        int guessFirstNumber=guess/10;
        int guessSecondNumber=guess%10;

        int winePrice;

        if(guess==randomMaker)
            winePrice=SAME_DIGIT_GIFT;
        else if((guessFirstNumber == randomMakerNumber1 || guessFirstNumber == randomMakerNumber2) &&
                (guessSecondNumber==randomMakerNumber1 ||guessSecondNumber==randomMakerNumber2))
            winePrice=TWO_DIGIT_GIFT;
        else if(guessFirstNumber == randomMakerNumber1 || guessSecondNumber==randomMakerNumber1 ||
                guessFirstNumber == randomMakerNumber2 || guessSecondNumber==randomMakerNumber2)
            winePrice=ONE_DIGIT_GIFT;
        else
            winePrice =0;
        System.out.printf("You Enter %d and win $%d%n", guess , winePrice);
    }
}

