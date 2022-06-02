package Collection2;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getlName().compareTo(o2.getlName());
    }
}
