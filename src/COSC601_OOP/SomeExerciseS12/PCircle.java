package SomeExerciseS12;

public class PCircle  implements java.lang.Comparable<PCircle> {
    private double radius;

    public PCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public int compareTo(PCircle c){
        if (this.radius==c.radius)
            return 0;
        else if (this.radius>c.radius)
            return 1;
        else
            return -1;

    }
}
