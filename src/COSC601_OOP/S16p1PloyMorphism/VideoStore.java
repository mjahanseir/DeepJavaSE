package S16p1PloyMorphism;

import java.util.ArrayList;

public class VideoStore {
    public static void main(String[] args) {

        Employee emp = new Employee("Dave", "Smith",31,12345,40, 10);

        Employee emp2=emp.clone();

        System.out.println("Is emp equal to emp2? " + (emp==emp2));
        System.out.println("Is emp copy to emp2? " + emp.equals(emp2));


        System.out.println(emp.getGrossPay());
        System.out.println(emp2.getGrossPay());

        Employee emp3= emp;

        System.out.println("Is emp equal to emp3? " + (emp==emp3));
        System.out.println("Is emp copy to emp3? " + emp.equals(emp3));

        Manager man= new Manager("Joe","Smith", 31,12345,5000);
        Manager manCopy= man.clone();

        System.out.println("******************");
        System.out.println("Is man equal to ManCopy? " + (man==manCopy));
        System.out.println("Is man copy to ManCopy? " + man.equals(manCopy));



        //Polymorphism

        ArrayList<Person> people= new ArrayList<>();

        Person p = new Employee();
        Person p2 = new Manager();

        Employee e= new Employee();
        Manager m = new Manager();

        people.add(p);
        people.add(e);
        people.add(m);



        ///////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Person> employees= new ArrayList<>();

        Person pp = new Employee();
        Person pp2 = new Manager();

        Employee ee= new Employee();
        Manager mm = new Manager();

        employees.add(pp);
        employees.add(ee);
        employees.add(mm);






    }
}
