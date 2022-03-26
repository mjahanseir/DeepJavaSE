
public class Q2 {
    public static void main(String[] args) {
        /*
        Write a program that displays the surface area of a pyramid with base
        length of 75 and side height of 41.7 using the formula
        Surface Area = 2 * base * side + base
        */

        //Variables
        int base=75;
        double side=41.7;
        double surfaceArea;

        //Calculate (Also can define " public static final double pi=3.14;" )
        surfaceArea = 2 *  base* side + Math.pow(base,2);

        System.out.println("Surface area of pyramid with " + base + "base length and "+
                side + " side height  = " + surfaceArea);
    }
}
