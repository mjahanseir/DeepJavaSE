
public class Q2 {
    public static void main(String[] args) {
        /*
        Method To Pad a Number With Zeroes
        The printf method allows for printing data with padding to format the output. Write your own method padData which accepts two parameters: a number and the total number of characters the result should be. The method will return the inputted number as a string, left padded with zeroes such that the string is the length of the second parameter. For example, if your method was called with the number 78 and the number 10 as parameters, it would return a string 0000000078. If the number is longer in digits than the second number, simply return the input number as a string without any change.

        input     padding   result

        78           10          0000000078

        123         2            123

        5634       6            005634

        Use the following method signature:

        public static String padData(int number, int pad)
         */
        //Variable

        System.out.println("input 78 and padding 10 "+ padData(78,10));
        System.out.println("input 123 and padding 2 "+ padData(123,2));
        System.out.println("input 5634 and padding 6 "+ padData(5634,6));
    }
    public static String padData(int number, int pad) {

        String input=Integer.toString(number);
        int numberCount=input.length();

        int diffrence= pad-numberCount;

        String zero="";
        if(diffrence<=0)
            return input;
        for (int i=1; i<=diffrence;i++){
            zero+="0";
        }
        return zero+input;

    }
}
