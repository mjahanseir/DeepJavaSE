package S10p1;

public class TestStaticCircle {
    public static void main(String[] args) {
        StaticCircle c1= new StaticCircle();
        StaticCircle c2= new StaticCircle();

        c1.printNumCircle();;

        StaticCircle c3= new StaticCircle(10);

        //  c2.printNumCircle();>>
        StaticCircle.printNumCircle();

        //for regular, we access by instant.Method
        c2.getRadius();

    }
}
