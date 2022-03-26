package S8p2Inheritance;

public class MainProgram {
    public static void main(String[] args) {


        SimpleCircle circle = new SimpleCircle();
        SimpleCircle circle2 = new SimpleCircle(10);
        System.out.println(circle.getCircumference());
        System.out.println(circle.getColor());
        System.out.println(circle2.getColor());
    }
}