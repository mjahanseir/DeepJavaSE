import java.util.Scanner;

public class ComputeAnglesMine {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter x,y for pint: ");
        double x1=scanner.nextDouble();
        double y1=scanner.nextDouble();

        System.out.print("Enter x,y for pint: ");
        double x2=scanner.nextDouble();
        double y2=scanner.nextDouble();

        System.out.print("Enter x,y for pint: ");
        double x3=scanner.nextDouble();
        double y3=scanner.nextDouble();

        double a= Math.sqrt (  Math.pow((x2-x3),2)   +   Math.pow((y2-y3),2) );
        double b= Math.sqrt (  Math.pow((x1-x3),2)   +   Math.pow((y1-y3),2) );
        double c= Math.sqrt (  Math.pow((x1-x2),2)   +   Math.pow((y1-y2),2) );

        double A=Math.toDegrees (Math.acos((Math.pow(a,2) -Math.pow(b,2) -Math.pow(c,2) ) / ((-2)*b*c )));
        double B=Math.toDegrees (Math.acos((Math.pow(b,2) -Math.pow(a,2) -Math.pow(c,2) ) / ((-2)*a*c )));
        double C=Math.toDegrees (Math.acos((Math.pow(c,2) -Math.pow(b,2) -Math.pow(a,2) ) / ((-2)*a *b )));

        System.out.println(A  + "    " + B  +  "     "+  c);







    }
}
