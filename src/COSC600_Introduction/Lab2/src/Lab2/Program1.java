package Lab2;

public class Program1 {
    public static void main(String[] args) {


    /*
1. Use the pow() method to apply an exponent and then store/output the result as an integer.
    - Create a new Java class within the above package - call it Program1
    - Add your public static void main method
    - Inside the main method, create three new int variables, x, exponent and result.
    - Assign the values of x and exponent to be 2 and 8 respectively.
    - Assign result to be the value of 2 to the power of 8, using the pow() method. The format is
    Math.pow(x,exponent). Note that you are assigning to an int and pow returns a floating point
    value so you will need to explicitly cast your answer to assign it.
    - Inside the main method, add a System.out.println call to output the variable result
     */
        int x=2;
        int exponent=8;
        int result= (int)(Math.pow(2,8));
        System.out.println(x+"^" + exponent + " = " +result);
    }
}
