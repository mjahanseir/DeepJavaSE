package SomePracctiseS14p1Cloneable.S14p1Cloneable;

/**
 * The Manager class is used to represent the Video Store manager.
 * The manager supervises the employees in the store and performs
 * other duties.
 * The Manager class inherits from the Person class.
 */
public class PManager extends PEmployee {
    /**
     * Default Constructor
     */
    public PManager() {
        //super() invoked automatically
    }

    /**
     * Constructor to initialize the class
     * @param fName The person's first name
     * @param lName The person's last name
     * @param age   The person's age
     * @param sin   The person's social insurance number
     * @param salary The manager's yearly salary
     */
    public PManager(String fName, String lName, int age, int sin, double salary ) {
        // have the super class deal with fName, lName, age, sin, salary
        super( fName, lName, age, sin, 0, salary );
    }

    /**
     * Get the manager's pay. This method overrides (hides) the method in
     * Employee, since a Manager is paid a flat salary.
     * @return The manager's gross pay.
     */
    public double getGrossPay() {
        return getPay();
    }

    @Override
    public PManager clone() {
        PManager copy = (PManager) super.clone();
        return copy;
    }
}
