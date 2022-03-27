package Tim.Section6OOP1Classes;

public class Cylander extends Circle{
    private double height;

    public Cylander(double radius, double height) {
        super(radius);
        if (height<0)
            this.height=0;
        else
            this.height=height;
    }

    public double getHeight() {
        return this.height;
    }
    public double getVolume(){
        return height*getArea();
    }
}
