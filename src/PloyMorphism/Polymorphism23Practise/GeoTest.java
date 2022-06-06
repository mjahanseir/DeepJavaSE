package S16p3Practise;

import S16p1PloyMorphism.Person;

import java.util.ArrayList;

public class GeoTest {
    public static void main(String[] args) {
        //Create Square and Circle O
        Square s= new Square();
        Circle c= new Circle();
        //Create 3 GeometricObject (Square and Circle  and Octagon)
        GeometricObject s1= new Square();
        GeometricObject c1= new Circle();
        GeometricObject o1= new Octogone();
        // Create an ArrayList and store all 5 in it
        ArrayList<GeometricObject> list= new ArrayList<>();
        list.add(s);
        list.add(c);
        list.add(s1);
        list.add(c1);
        list.add(o1);
        // Create a foreach loop on the list to iterate it and call the getArea and toString for each element
        for (GeometricObject obj : list) {
            System.out.println(obj.getArea() + " " + obj.toString());

            if(obj instanceof Square){
                System.out.println(   ((Square) obj).getSide()  );
            }
        }
    }
}
