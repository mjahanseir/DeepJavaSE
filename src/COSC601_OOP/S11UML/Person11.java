package S11UML;

public abstract  class Person11 {
    //PROPERTIES
    private String fname;
    private String lname;
    private int age;
    private int sin;

    //CONSTRUCTORS
    public Person11(){
        this("","",18,999999999);
    }

    /**   JavaDoc auto document (/** Enter)
     *
     * @param fname - person's first name
     * @param lname - person's last name
     * @param age   - person's age
     * @param sin   - person's sin#
     */
    public Person11(String fname, String lname, int age, int sin) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.sin = sin;
    }

    @Override
    public String toString() {
        //STRING BUILDER
        StringBuilder str= new StringBuilder(getClass().getName());
        str.append(" [");
        str.append("Name: "+fname+" "+ lname);
        str.append(", age :"+ age);
        str.append(", sin :"+ sin);
        str.append("]");

        return str.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Person11) {
            Person11 p = (Person11) obj;
            if (this.sin == p.sin) {
                result = true;
            }
        }
        return result;
    }


public abstract double getGrossPay();


    }
