package SomePracticeS8p2Inheritance.S8p2Inheritance;

public class MainProgram {
    public static void main(String[] args) {


        SimpleCircle circle = new SimpleCircle();
        System.out.println(circle.getCircumference());
        System.out.println(circle.getColor());

        SimpleCircle circle2 = new SimpleCircle(10);

        System.out.println(circle2.getColor());
    }
}