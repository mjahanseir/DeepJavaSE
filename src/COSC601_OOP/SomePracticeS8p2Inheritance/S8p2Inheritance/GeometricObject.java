package SomePracticeS8p2Inheritance.S8p2Inheritance;

public class GeometricObject {
     private String color; //protected
    private boolean filled;

    public GeometricObject(){
        this.color="Blue";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}
