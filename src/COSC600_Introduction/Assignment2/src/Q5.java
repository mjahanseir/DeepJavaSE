public class Q5 {

    //(Dice Roll) Write a program Q5 that will simulate rolling a pair of dice 100,000 times,
    // keeping track of the sum of the two die rolls.
    // So for each roll of the dice, the value will be a total between 2 and 12.
    // At the end of the program provide a report on how many times each of
    // the combinations between 2 and 12 were rolled.


    public static void main(String[] args) {
        rolling();
    }

    //Divide program in small piece
    //rolling() method shows the combination of iteration each dice should taken
    public static void rolling() {

        int sum2=0;
        int sum3=0;
        int sum4=0;
        int sum5=0;
        int sum6=0;
        int sum7=0;
        int sum8=0;
        int sum9=0;
        int sum10=0;
        int sum11=0;
        int sum12=0;

        for (int i=1 ; i<=100000 ; i++){
            int dice1=(int)(Math.random()*6) + 1;
            int dice2=(int)(Math.random()*6) + 1;
            int sumDice=dice1+dice2;
            switch (sumDice){
                case 2:
                    sum2++;
                    break;
                case 3:
                    sum3++;
                    break;
                case 4:
                    sum4++;
                    break;
                case 5:
                    sum5++;
                    break;
                case 6:
                    sum6++;
                    break;
                case 7:
                    sum7++;
                    break;
                case 8:
                    sum8++;
                    break;
                case 9:
                    sum9++;
                    break;
                case 10:
                    sum10++;
                    break;
                case 11:
                    sum11++;
                    break;
                case 12:
                    sum12++;
                    break;
            }
        }
        System.out.println("number of the combinations between 2 and 12 rolled in 100,000 times.");
        System.out.println("********************************************************************");
        System.out.println("Number of  2 = "+ sum2);
        System.out.println("Number of  3 = "+ sum3);
        System.out.println("Number of  4 = "+ sum4);
        System.out.println("Number of  5 = "+ sum5);
        System.out.println("Number of  6 = "+ sum6);
        System.out.println("Number of  7 = "+ sum7);
        System.out.println("Number of  8 = "+ sum8);
        System.out.println("Number of  9 = "+ sum9);
        System.out.println("Number of 10 = "+ sum10);
        System.out.println("Number of 11 = "+ sum11);
        System.out.println("Number of 12 = "+ sum12);
    }


}


