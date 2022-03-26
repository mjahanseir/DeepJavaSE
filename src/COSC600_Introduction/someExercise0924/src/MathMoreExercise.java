public class MathMoreExercise {
    public static void main(String[] args) {

        System.out.println("Math.sqrt(4) "+ Math.sqrt(4));
        System.out.println("Math.sin(2 * Math.PI) "+Math.sin(2 * Math.PI));
        System.out.println("Math.cos(2 * Math.PI) "+Math.cos(2 * Math.PI));

        System.out.println("Math.pow(2, 2) "+ Math.pow(2, 2));
        System.out.println("Math.log(Math.E) "+ Math.log(Math.E));
        System.out.println("Math.exp(1) " + Math.exp(1));

        System.out.println("Math.max(2, Math.min(3, 4)) "+ Math.max(2, Math.min(3, 4)));

        double var= -2.5;
        System.out.println(" Math.rint(2.5) " + Math.rint(var) );
        System.out.println("Math.ceil(−2.5) " +Math.ceil(var));
        System.out.println("Math.floor(−2.5) " +Math.floor(var));

        System.out.println("Math.round(−2.5f) "+ Math.round(var));


        System.out.println("#######################");


        System.out.println("\n 1- isDigit('a') is " + Character.isDigit('a'));

        System.out.println("\n 2- isLetter('a') is " + Character.isLetter('a'));

        System.out.println("\n 2- isLetterOrDigit('a') is " + Character.isLetterOrDigit('a'));

        System.out.println("\n 3-isLowerCase('a') is " + Character.isLowerCase('a'));

        System.out.println("\n 4-isUpperCase('a') is " + Character.isUpperCase('a'));

        System.out.println("\n 5-toLowerCase('T') is " + Character.toLowerCase('T'));

        System.out.println("\n 6-toUpperCase('q') is " + Character.toUpperCase('q'));


        int rnd= (int) (Math.round(Math.random())* (122-97+1));
        System.out.println((char)rnd);

        /*

(k)
(l) Math.round(−2.5)
(m) Math.rint(2.5)
(n) Math.ceil(2.5)
(o) Math.floor(2.5)
(p) Math.round(2.5f)
(q) Math.round(2.5)
(r) Math.round(Math.abs(−2.5))
         */
    }
}
