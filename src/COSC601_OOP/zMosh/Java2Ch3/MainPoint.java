package zMosh.Java2Ch3;

public class MainPoint {
    public static void main(String[] args) {
        var point1= new Point(1,2);
        var point2= new Point(1,2);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

    }

}
