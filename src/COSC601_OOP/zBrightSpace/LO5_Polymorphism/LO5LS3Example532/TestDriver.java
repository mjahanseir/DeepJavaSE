package zBrightSpace.LO5_Polymorphism.LO5LS3Example532;

public class TestDriver
{
    public static void main( String[] args )
    {
        Employee e1 = new Employee("Jon", "Doe", 40, 123456789, 0, 100);
        Employee e2 = new Employee("Jon", "Doe", 40, 123456789, 0, 100);
        Manager m1 = new Manager("Jon", "Doe", 40, 123456789, 100);

        // displays true - same class and same values
        System.out.println("e1 equals e2? " + e1.equals(e2));
        // the following two statements display false - different classes
        System.out.println("e1 equals m1? " + e1.equals(m1));
        System.out.println("m1 equals e1? " + m1.equals(e1));
        // displays false - null value passed in
        System.out.println("e1 equals null? " + e1.equals(null));
    }
}

