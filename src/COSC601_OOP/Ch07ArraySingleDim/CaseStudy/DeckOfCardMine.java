package Ch07ArraySingleDim.CaseStudy;

public class DeckOfCardMine {
    public static void main(String[] args) {


        // 0–12 Spades
        // 13–25 Hearts
        // 26–38 Diamonds
        // 39–51 Clubs

        // cardNumber / 13 =  0  spade
        //                 =  1  heart
        //                 =  2 diamond
        //                 =  3  club

        // cardNumber % 13 =  0  Ace
        //                 =  1  2
        //                 =  2 3
        //                 =.....
        //                 =  10  jack
        //                 =  11  queen
        //                 =  12  king

        int[] deck = new int[52];

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        for (int o: deck){
            System.out.println(o);
        }
//        for (int i = 0; i < 4; i++) {
//            String suit = suits[deck[i] / 13];
//            String rank = ranks[deck[i] % 13];
//            System.out.println("Card number " + deck[i] + ": "
//                                  + rank + " of " + suit);
//        }

        for (int i = 0; i < 4; i++) {
            int cardNumber = (int)(Math.random() * deck.length);
            String suit = suits[cardNumber / 13];
            String rank = ranks[cardNumber % 13];
            System.out.println("Card number " + cardNumber + ": "
                                + rank + " of " + suit);
        }

    }
}
