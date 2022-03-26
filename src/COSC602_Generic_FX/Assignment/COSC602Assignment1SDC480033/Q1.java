package Assignment1;

public class Q1 {
    /*
    Question 1
    Create a recursive method which computes a series:
    F(x) = 1/3 + 2/5 + 3/7 + 4/9 + ... + x/(2x+1)
     */
    public static void main(String[] args) {
        System.out.println(f(2));
    }
    public static double f(double x){
        if(x <= 1)
            return 1/3.0;
        else
            return  ( x/(2*x+1) ) + f( (x-1)/(2*x-1));
    }
}
