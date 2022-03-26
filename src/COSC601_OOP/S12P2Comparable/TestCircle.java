package S12P2Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestCircle {
    public static void main(String[] args) {


        Circle c1 = new Circle(10);
        Circle c2 = new Circle(15);
        Circle c3 = new Circle(5);

        ArrayList<Circle> list= new ArrayList<Circle>();

        list.add(c1);
        list.add(c2);
        list.add(c3);

        for (Circle c:list)
            System.out.println(c.getRadius());

        Collections.sort(list);

        for (Circle c:list)
            System.out.println(c.getRadius());
    }
}
