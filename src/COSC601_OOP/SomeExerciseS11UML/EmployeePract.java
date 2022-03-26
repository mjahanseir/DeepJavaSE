package SomeExerciseS11UML;

public class EmployeePract extends PersonPract {
    private double pay;
    private double hoursWorked;

    public EmployeePract(){
        this.pay=0.0;
        this.hoursWorked=0.0;
    }

    /**
     *
     * @param fname
     * @param lname
     * @param age
     * @param sin
     * @param pay
     * @param hoursWorked
     */
    public EmployeePract(String fname, String lname, int age, int sin, double pay, double hoursWorked) {
        super(fname, lname, age, sin);
        this.pay = pay;
        this.hoursWorked = hoursWorked;
    }

    /**
     *
     * @return
     */
    public double getGrossPay(){
        return this.pay*this.hoursWorked;
    }
}
