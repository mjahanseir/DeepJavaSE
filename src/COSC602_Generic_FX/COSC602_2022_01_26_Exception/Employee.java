package COSC60220220126Exception;

public class Employee implements Comparable<Employee>, Cloneable{

    /**
     **** Instance Variables
     * employeeNum -
     * fName -
     */
    private int employeeNum;
    private String fName;
    private String lName;
    private String deptCode;
    private String email;
    private double salary;
    private int age;

    public Employee() throws Exception {
        this(11111, "John", "Doe");
        System.out.println("Invoking no arg constructor");
    }
    public Employee(int employeeNum, String fName, String lName) throws Exception {
        this(employeeNum, fName, lName, "", "", 0);
        System.out.println("Invoking partial constructor");
    }

    public Employee(int employeeNum, String fName, String lName, String deptCode, String email, double salary) throws Exception {
        this.employeeNum = employeeNum;
        this.fName = fName;
        this.lName = lName;
        this.deptCode = deptCode;
        this.email = email;
        this.salary = salary;
        if(age<0)
            throw new IllegalAgeValueException(age);
    }

    /**
     * getter method for employeeNum instance variable
     * @return the employee number as an int
     */
    public int getEmployeeNum() {
        return employeeNum;
    }

    /**
     * setter method for employeeNum instance variable
     * @param employeeNum - The employee number. must be numeric.
     */
    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        return fName + " " + lName;
    }

    public boolean equals(Object obj){

        if (obj instanceof Employee){
            if (this.employeeNum == ((Employee) obj).employeeNum){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Employee o) {

        if (this.employeeNum>o.employeeNum)
            return 1;
        else if (this.employeeNum<o.employeeNum)
            return -1;
        return 0;

        // short form if comparing numbers and want to return the
        // difference between them instead of just 1, -1, 0
        //return (int)(this.salary-o.salary);
    }
}
