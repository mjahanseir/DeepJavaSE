import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
/*      Question 11 – Class Name Q11
        Write a program which simulates a card drawing game. The computer will ‘draw’ one card and
        the player will draw one card. The highest draw wins. In the case of a tie, the house (computer)
        wins. Each card draw is assumed to be random.
        The cards
        Cards are divided into 4 suits (hearts, spades, clubs and diamonds). Each suit has 13 cards
        numbered from 2 to 10 plus a jack, queen, king and ace. Each card has a value. Cards 2-10 have
        their face value (ie. 8 of spades counts 8). Jack, Queen and King don’t have a value per se but
        have increasing priority. ie. a jack is higher than a ten but a queen is higher than a jack. An ace is
        considered the highest card. Hint: You might find it useful to view the deck as 0-12, 13-25, 26-
        38, 39-51 for the four suits. Also, each card only exists once in a deck so if one player draws a
        particular card, the other player can’t draw that card.
        For each draw, your program will determine who wins based on comparing the cards. However,
        its not enough to simply determine winners and losers. Your program also has to state what card
        each player drew and then declare the winner. No marks will be awarded without this
 */
        Scanner scanner = new Scanner(System.in);

        String deck1="234567891jqka";
        String deck2="234567891jqka";
        String deck3="234567891jqka";
        String deck4="234567891jqka";

        //create one string that shows all 52 cards with one specific location
        //2~10(1 represent 10) and Jake/Queen/King/Ace
        String deckAll=deck1+deck2+deck3+deck4;

        //create a random number for find String number
        int randomCard= (int) Math.round(Math.random()*52);
        char firstSelection= deckAll.charAt(randomCard);

        //Delete first selected card from All Cards
        int deckAllLength = deckAll.length();
        String newDeck= deckAll.substring(0, randomCard)+ deckAll.substring((randomCard+1) , deckAllLength);

        /////////// "randomCard" is weight of first selection and  "firstSelection" is card name for first time  /////////////////////
        // I give user input and make a random number from user's input, also we can calculate only by this input and compare with the random number that generated above
        System.out.print("Please Enter a number: ");
        int userSelection=scanner.nextInt();
        int userRandom=((int) Math.round(Math.random()*userSelection));
        char userSelectionRandomized= newDeck.charAt(randomCard);

        ///////////////   Decision who win   ////////////////////////////////////
        System.out.println("********** Result  **********");
        if (randomCard>userRandom){
            System.out.println("Computer is winner!");
        } else if (randomCard<userRandom){
            System.out.println("You are winner!");
        }else {
            System.out.println("Invalid data!");
        }

        System.out.println("********** Details  **********");
        ///////////////   Decision which cart Selected by computer   ////////////////////////////////////
        switch (firstSelection){
            case '2': case '3': case '4' : case '5': case '6': case '7': case '8': case '9': case '1':
                if (randomCard<12)
                    System.out.println( "Computer select "+ firstSelection + " Heart.");
                else if(randomCard<25)
                    System.out.println( "Computer select "+ firstSelection + " Spade.");
                else if(randomCard<38)
                    System.out.println( "Computer select "+ firstSelection + " Club.");
                else
                    System.out.println( "Computer select "+ firstSelection + " Diamond.");
                break;
            case 'j': case 'q': case 'k': case 'a':
                if (randomCard<13)
                    System.out.println( "Computer select Jake Heart.");
                else if(randomCard<26)
                    System.out.println( "Computer select Queen Spade.");
                else if(randomCard<39)
                    System.out.println( "Computer select King Club.");
                else
                    System.out.println( "Computer select Ace Diamond.");
                break;
            default:
                System.out.println("number: " + randomCard  + "card: "+  firstSelection);
        }

        ///////////////   Decision which cart Selected by user   ////////////////////////////////////
        switch (userSelectionRandomized){
            case '2': case '3': case '4' : case '5': case '6': case '7': case '8': case '9': case '1':
                if (userRandom<12)
                    System.out.println( "You select "+ userSelectionRandomized + " Heart.");
                else if(userRandom<25)
                    System.out.println( "You select "+ userSelectionRandomized + " Spade.");
                else if(userRandom<38)
                    System.out.println( "You select "+ userSelectionRandomized + " Club.");
                else
                    System.out.println( "You select "+ userSelectionRandomized + " Diamond.");
                break;
            case 'j': case 'q': case 'k': case 'a':
                if (userRandom<13)
                    System.out.println( "You select Jake Heart.");
                else if(userRandom<26)
                    System.out.println( "You select Queen Spade.");
                else if(userRandom<39)
                    System.out.println( "You select King Club.");
                else
                    System.out.println( "You select Ace Diamond.");
                break;
            default:
                System.out.println("number: " + userRandom  + "card: "+  userSelectionRandomized);
        }
    }
}