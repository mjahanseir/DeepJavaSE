package SomePracticeS8p2Inheritance.S8p2Inheritance;

public class SimpleCircle extends GeometricObject {
    private double radius;

    public SimpleCircle(){
        this.radius=1;
        setColor("red");
    }

    public SimpleCircle(double radius){
        // a call to inherited class constructor happens here

        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return radius * radius * Math.PI;
    }
    public double getCircumference() {
        return 2* radius*Math.PI;
    }
}
