package S16p2PloyMorphism;

public class PolyTester {
    public static void main(String[] args) {

        print(new GraduateStudent());
        print(new Student());
        print(new Person());

        print(new Object());

    }

    public static void print(Object o){
        System.out.println(o.toString());
    }

}
