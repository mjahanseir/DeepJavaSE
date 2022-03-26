import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        Write a program that displays the surface area and volume for two
        cylinders with radii 8 and 12.3 using. height=6.5
        the following formulas:
        Surface Area = 2* pi * r^2 + 2*pi * r * h
        Volume = pi * r^2 * h
        */

        //Variables
        double height=6.5;
        double radius, surfaceArea,volume;

        //input
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please Enter Radius: ");
        radius=scanner.nextDouble();

        //Calculate (Also can define " public static final double pi=3.14;" )
        surfaceArea = ( 2 * Math.PI * Math.pow(radius,2) )+
                ( 2 * Math.PI * radius * height);
        volume = Math.PI * Math.pow(radius,2) * height;

        System.out.println("Surface area= " + surfaceArea);
        System.out.println("Volume= " + volume);


    }
}
