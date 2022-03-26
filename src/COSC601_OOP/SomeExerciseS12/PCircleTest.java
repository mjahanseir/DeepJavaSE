package SomeExerciseS12;

import java.util.ArrayList;
import java.util.Collections;

public class PCircleTest {
    public static void main(String[] args) {
        PCircle c1 = new PCircle(10);
        PCircle c2 = new PCircle(15);
        PCircle c3 = new PCircle(5);


        ArrayList<PCircle> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);

        for (PCircle c : list)
            System.out.println(c.getRadius());

        Collections.sort(list);

        for (PCircle c : list)
            System.out.println(c.getRadius());
    }

}
