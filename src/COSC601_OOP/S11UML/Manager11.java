package S11UML;

public class Manager11 extends Employee11 {
    //PROPERTIES


    //CONSTRUCTORS
    public Manager11(){

    }

    public Manager11(String fname, String lname, int age, int sin, double pay, double hoursWorked) {
        super(fname, lname, age, sin, pay, hoursWorked);
    }

    //METHODS
    @Override
    public double getGrossPay(){
        return super.getGrossPay()+1000;

    }
}
