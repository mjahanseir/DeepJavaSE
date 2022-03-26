package SomePracticeS8p2Inheritance.S8p2Inheritance.InheritanceExercise;

public class MainFruit {
    public static void main(String[] args) {

        Apple a= new Apple();
        System.out.println(a.getColor());

        Orange o= new Orange();
        System.out.println(o.getColor());

        Fruit f= new Fruit("black");
        System.out.println(f.getColor());
    }
}
