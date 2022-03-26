package SomeExerciseS10p1.S10p1;

public class StaticCircle {
    private double radius;
    private static int numCircle=0;

    public StaticCircle(){
        this.radius=1;
        numCircle++;
    }

    public StaticCircle(double aRadius){
        radius=aRadius;
        numCircle++;
    }

    public double getRadius() {
        return radius;
    }

    public static void printNumCircle(){
        System.out.println("You have created " + numCircle);
    }
}
