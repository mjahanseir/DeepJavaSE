package S12P2Comparable;

public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public int compareTo(Circle c){
        if(this.radius== c.radius)
            return 0;
        else if(this.radius>c.radius)
            return 1;
        else
            return -1;
    }
}
