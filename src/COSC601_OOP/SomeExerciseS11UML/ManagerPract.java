package SomeExerciseS11UML;

public class ManagerPract extends EmployeePract {

    public ManagerPract(String fname, String lname, int age, int sin, double pay, double hoursWorked) {
        super(fname, lname, age, sin, pay, hoursWorked);
    }

    @Override
    public double getGrossPay(){
        return super.getGrossPay()+1000;
    }
}
