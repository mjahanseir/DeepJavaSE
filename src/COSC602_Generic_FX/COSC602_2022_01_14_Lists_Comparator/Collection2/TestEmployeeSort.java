package Collection2;
import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeSort {
    public static void main(String[] args) {
        ArrayList<Employee> emps= new ArrayList<>();

        emps.add(new Employee(444,"Dave", "Smith", " ", "", 50000));
        emps.add(new Employee(333,"Joe", "Smyth", " ", "", 60000));
        emps.add(new Employee(222,"Bob", "Jonson", " ", "", 10000));

        for(Employee e: emps)
            System.out.println(e.getfName());

        Collections.sort(emps);

        for(Employee e: emps)
            System.out.println(e.getfName());

        System.out.println("********** lName ***************");


        Collections.sort(emps,new LastNameComparator());

        for(Employee e: emps)
            System.out.println(e.getfName());

        System.out.println("*********** Salary **************");


        Collections.sort(emps,new SalaryComparator());

        for(Employee e: emps)
            System.out.println(e.getfName());


    }
}
