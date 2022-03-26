public class Q9 {

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        //variables
        String  numberString = String.valueOf(number);
        int firstNumber= Integer.parseInt(String.valueOf(numberString.charAt(0)));

        //check credit card number length (Card must have between 13 and 16 digits)
        if(getSize(number)>=13 && getSize(number)<=16){
            //Check the Prefix of 4, 5, 37,6
            if(prefixCorrect(number,firstNumber)) {
                //Check divisible by 10,
                int calculation = sumOfDoubleEvenPlaces(number) + sumOfOddPlaces(number);
                if (calculation%10==0){
                    return true;
                }
            }
        }
        return false;
    }//END of Method

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlaces(long number){
        //variables
        String numberString = String.valueOf(number);
        int sumOfDoubleEven = 0;

        //parsing the input left to right to sum every other number and follow algorithm structure
        for (int i = 0; i < numberString.length(); i+=2) {
            //local variable
            int eachNumber = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            eachNumber*=2;
            if (eachNumber>=10){
                //call proper method to calculate 2 individual number
                eachNumber=getSumDigits(eachNumber);
            }
            sumOfDoubleEven += eachNumber;
        }//END of Loop
        return sumOfDoubleEven;
    }//END of Method

    /** Return number if it is a single digit, otherwise,
     * return the sum of the two digits(from step 1) */
    public static int getSumDigits(int number){
        //if 6*2=12 => 12%10=2 and 12/10=1 THEN 2+1=3
        int reminder=number%10;
        int divider= number/10;
        return  reminder+divider;
    }//END of Method

    /** Return sum of odd-place digits in number (step 3)*/
    public static int sumOfOddPlaces(long number){
        //same as sumOfDoubleEvenPlaces method, sum each odd place digits and return that sum
        //variables
        String numberString = String.valueOf(number);
        int sumOdd = 0;
        //loop to find odd index and sum proper numbers
        for (int i = 1; i < numberString.length(); i+=2) {
            int eachNumber = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            sumOdd += eachNumber;
        }
        return sumOdd;
    }//END of Method
    /** Return true if number has a proper prefix */
    public static boolean prefixCorrect(long number, int d){
        String  numberString = String.valueOf(number);
        //check credit card starting (must start with 4, 5 , 37, 6)
        switch (d) {
            case 4:
            case 5:
            case 6:
                return true;
            case 3: {
                //inner condition to check second number, if 37 return true
                int secondNumber= Integer.parseInt(String.valueOf(numberString.charAt(1)));
                if (secondNumber==7) {
                    return true;
                }
                break;
            }
        }//END of SWITCH
        return false;
    }//END of Method

    /** Return the number of digits in d */
    public static int getSize(long d){
        String  dString = String.valueOf(d);
        int numberLength = dString.length();
        return numberLength;
    }//END of Method

}//End of Class
