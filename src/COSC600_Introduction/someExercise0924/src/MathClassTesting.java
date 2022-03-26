import jdk.swing.interop.SwingInterOpUtils;

public class MathClassTesting {

    public static void main(String[] args) {
        System.out.println(Math.toDegrees(Math.PI / 2));


        System.out.println(Math.toRadians(30));
        System.out.println(Math.sin(0));

        System.out.println("*******  Round   ********");

        System.out.println(Math.ceil(2.0));
        System.out.println(Math.ceil(-2.0));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.ceil(-2.1));
        System.out.println(Math.ceil(2.2));
        System.out.println(Math.ceil(-2.2));
        System.out.println(Math.ceil(2.8));
        System.out.println(Math.ceil(-2.8));
        System.out.println(Math.ceil(2.9));

        System.out.println("                   flooor                 ");
        System.out.println(Math.floor(2.0));
        System.out.println(Math.floor(-2.2));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.floor(2.7));
        System.out.println(Math.floor(-2.7));
        System.out.println(Math.floor(2.9));

        System.out.println("              Rint                 ");
        System.out.println(Math.rint(-2.0));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.rint(-2.5));
        System.out.println(Math.rint(2.6));
        System.out.println(Math.rint(-2.7));


        System.out.println("              Round                 ");
        System.out.println(Math.round(-2.0));
        System.out.println(Math.round(2.0));

        System.out.println(Math.round(-2.5));
        System.out.println(Math.round(2.5));

        System.out.println(Math.round(-2.6));
        System.out.println(Math.round(2.6));


        /*
        Math.ceil(2.1) returns 3.0
Math.ceil(2.0) returns 2.0
Math.ceil(−2.0) returns −2.0
Math.ceil(−2.1) returns −2.0
Math.floor(2.1) returns 2.0
Math.floor(2.0) returns 2.0
Math.floor(−2.0) returns −2.0
Math.floor(−2.1) returns −3.0
Math.rint(2.1) returns 2.0
Math.rint(−2.0) returns −2.0
Math.rint(−2.1) returns −2.0
Math.rint(2.5) returns 2.0
Math.rint(3.5) returns 4.0
Math.rint(−2.5) returns −2.0
Math.round(2.6f) returns 3 // Returns int
Math.round(2.0) returns 2 // Returns long
Math.round(−2.0f) returns −2 // Returns int
Math.round(−2.6) returns −3 // Returns long
Math.round(−2.4) returns −2 // Returns long
         */


    }
}

