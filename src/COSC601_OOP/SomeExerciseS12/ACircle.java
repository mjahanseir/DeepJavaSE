package SomeExerciseS12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ACircle implements java.lang.Comparable<ACircle> {
    private double radius;

    public ACircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public int compareTo(ACircle c){
        if (this.radius==c.radius) {
            return 0;
        }else if (this.radius>c.radius) {
            return 1;
        }else
            return -1;
    }


    public static void main(String[] args) {
        ACircle c1= new ACircle(10);
        ACircle c2= new ACircle(15);
        ACircle c3= new ACircle(5);

        ArrayList<ACircle> list = new ArrayList<ACircle>();

        list.add(c1);
        list.add(c2);
        list.add(c3);

        for (ACircle c : list)
            System.out.println(c.getRadius());

        Collections.sort(list);

        for (ACircle c : list)
            System.out.println(c.getRadius());


    }
}
