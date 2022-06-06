package S16p3Practise;

public abstract class GeometricObject {
    private String colorString;

    public String getColorString() {
        return colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "I am a geometric Object";
    }
}
