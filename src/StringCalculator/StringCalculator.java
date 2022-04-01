package StringCalculator;

public class StringCalculator {

    /////////////////////////////////////////////STEP 2
    public static int add(String numbers){

        int returnValue=0;
        String delimiter=",|\n";

        if(numbers.startsWith("//")){
            int delimiterIndex=numbers.indexOf("//")+2;
            delimiter=numbers.substring(delimiterIndex, delimiterIndex+1);
            numbers=numbers.substring(delimiterIndex+1);
        }

        //split number
        String[] numberArray= numbers.split(delimiter);

//        if(numberArray.length>2){
//            throw new RuntimeException("Maximum of 2 numbers enter");
//        }else{

        for(String number : numberArray) {
            if (!number.trim().isEmpty()) {
                returnValue+= Integer.parseInt(number.trim());
            }
        }

//        }
        return add(numbers , delimiter);
    }

    //////////////////////REFACTOR as METHOD
    private static int add(String numbers, String delimiter){
        int returnValue=0;
        String[] numberArray= numbers.split(delimiter);
        for(String number : numberArray) {
            if (!number.trim().isEmpty()) {
                int numberInt =  Integer.parseInt(number.trim());
                if (numberInt<0)
                    throw new RuntimeException("Negative number not allowed");
                if (numberInt<=1000)
                returnValue+=numberInt;
            }
        }
        return returnValue;
    }

}