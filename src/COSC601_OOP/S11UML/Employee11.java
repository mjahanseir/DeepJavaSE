package S11UML;

public class Employee11 extends Person11 {
    //PROPERTIES
    private double pay;
    private double hoursWorked;

    //CONSTRUCTORS
    public Employee11(){
        this.pay=0.0;
        this.hoursWorked=0.0;
    }

    /**
     * @param fname - person's first name
     * @param lname - person's last name
     * @param age   - person's age
     * @param sin   - person's sin#
     * @param pay   - pay information
     * @param hoursWorked - number of hours worked
     */
    public Employee11(String fname, String lname, int age, int sin, double pay, double hoursWorked) {
        super(fname, lname, age, sin);
        this.pay = pay;
        this.hoursWorked = hoursWorked;
    }

    //METHODS
    /**
     * calculate and return the employee's gross pay
     * @return the employee's gross pay
     */
    public double getGrossPay(){
        return this.pay * this.hoursWorked;
    }


        @Override
        public String toString() {
             StringBuilder str= new StringBuilder(super.toString());
             str.append(" [");
             str.append("pay: "+ pay);
             str.append(", hours worked :"+ hoursWorked);
             str.append("]");

            return str.toString();
        }


    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Employee11) {
            Employee11 e = (Employee11) obj;
            if (super.equals(e) && this.pay == e.pay) {
                result = true;
            }
        }
        return result;
    }
}
