package zBrightSpace.LO4_Inheritance_Interfaces.LO4LS4Example442;

public class Person {

/**
 * The person class is the base class for the people working in a
 * video store.  It provides the common attributes for all.
 */

    private String firstName;   // person's first name
    private String lastName;    // person's last name
    private int age;            // person's age
    private int sin;            // person's social insurance number

    /**
     * Default Constructor
     */
    public Person() {
        firstName = "";  // person's first name
        lastName = "";   // person's last name
        age = 0;         // person's age
        sin = 0;         // person's social insurance number
    }

    /**
     * Constructor to initialize the object.
     * @param fName The person's first name
     * @param lName The person's last name
     * @param age   The person's age
     * @param sin   The person's social insurance number
     */
    public Person( String fName, String lName, int age,int sin) {
        firstName = fName;
        lastName = lName;
        /* The "this" keyword specifies that you are referencing the class
         * attribute age rather than the method argument age.
         */
        this.age = age;
        this.sin = sin;
    }

    // get and set methods for each attribute could be here too...

    /**
     * The toString method provides a representation of all values for
     * this Employee. This method overrides (hides) the method in Object.
     * @return A string with the class name, and a list of all attributes
     *   and their values
     */
    public String toString(){
        /*
         * For demonstration purposes we will use a StringBuffer because it
         * is more efficient than using String concatenation. In most cases
         * however, it doesn't matter what you use.
         */

        // use the getClass method from Object to get the class name.
        StringBuffer str = new StringBuffer( getClass().getName() );
        str.append( "[" );
        str.append( "firstName=" + firstName );
        str.append( ", lastName=" + lastName );
        str.append( ", age=" + age );
        str.append( ", sin=" + sin );
        str.append( "]" );
        return str.toString();
    }

    /**
     * This method is used to compare to objects of the class type Person
     * @param obj The object to compare.
     * @return True if both objects are the same.
     */
    public boolean equals( Object obj ){
        boolean result = false;
        if ( obj instanceof Person ){ // test compatibility
            Person p = (Person) obj; // cast the object as a person

            // Compare the person attributes.
            if ( firstName.equals( p.firstName ) &&
                    lastName.equals( p.lastName ) &&
                    age == p.age && sin == p.sin )
            {
                result = true;
            }
        }
        return result;
    }

}