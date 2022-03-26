package aaMID601;

public class Triangle {

    //Properties
    private double side1;
    private double side2;
    private double sideBase;
    private double height;

    //Constructors
    public Triangle(){
        this(1,1,1,1);
    }
    public Triangle(double side1, double side2, double sideBase, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.sideBase = sideBase;
        this.height = height;
    }

    //Methods


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSideBase() {
        return sideBase;
    }

    public double getHeight() {
        return height;
    }
    public double getArea(){
        return (this.sideBase * this.height)/2;
    }
    public double getPerimeter(){
        return this.side1+ this.side2+this.sideBase;
    }

}
