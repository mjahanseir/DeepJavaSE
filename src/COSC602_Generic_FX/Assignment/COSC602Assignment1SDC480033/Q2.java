package Assignment1;

public class Q2 {
    /*
    Question 2
    Create a recursive method to convert from binary to decimal. Your solution will use the following
    signature:
    public static int binaryToDecimal(int binary)
    You may not use built-in String functions for any conversion.
    */
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(10));
        System.out.println(binaryToDecimal(100));
        System.out.println(binaryToDecimal(1000));
    }

    //10= [(10%10)* 2^0 + ((10/10)%10)*2^1
    //             0    +       1*2
    //binary= binary%10 *2^0 + ((binary/10)%10)*2^1
    //Recursive
    //F(n)= F(n,exp)
    //F(n,exp)= n%10*2^exp +F(n/10,exp++)

    public static int binaryToDecimal(int binary) {
        return binaryToDecimal(binary, 0);
    }
    public static int binaryToDecimal(int binary, int exp) {
        if (binary == 0) {
            return 0;
        }
        return (int) (binary % 10 * Math.pow(2, exp) + binaryToDecimal(binary / 10, exp++));
    }
}
