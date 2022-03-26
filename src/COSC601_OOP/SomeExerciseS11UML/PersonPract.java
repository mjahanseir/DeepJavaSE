package SomeExerciseS11UML;

public class PersonPract {
    private String fname;
    private String lname;
    private int age;
    private int sin;


    public PersonPract(){
        this("","", 18,99999);
    }

    /**
     * This is a constructor
     * @param fname
     * @param lname
     * @param age
     * @param sin
     */
    public PersonPract(String fname, String lname, int age, int sin) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.sin = sin;
    }

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder(getClass().getName());
        str.append("[");
        str.append("Name: " + fname + " "+ lname);
        str.append(", age: " + age );
        str.append(", sin: " + sin   );

        return str.toString();
    }
}
