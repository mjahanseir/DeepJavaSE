package S10p1;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger x= new MyInteger(10);

        //AUTOMATIC BOXING
        // ****converting a primitive to wrapper class =BOXING
        Integer y=10;

       // Integer y2= new Integer(10); // deprecated  BOXING

        Integer y3= Integer.valueOf("10"); //deprecated

        double a= x.toDouble();
        Double a2= Double.valueOf("100");
        Double a3= Double.parseDouble("100");
        //converting a wrapper t primitive  =UNBOXING
        a= Double.valueOf("100");

        System.out.println(a);
    }
}
