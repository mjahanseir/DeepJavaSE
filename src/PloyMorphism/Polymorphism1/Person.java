package S16p1PloyMorphism;

import java.util.Date;


public class Person implements Cloneable, Comparable<Person>{
    private String firstName;   // person's first name
    private String lastName;    // person's last name
    private int age;            // person's age
    private int sin;            // person's social insurance number
    private Date birthDate;

    public Person() {
        firstName = "";  // person's first name
        lastName = "";   // person's last name
        age = 0;         // person's age
        sin = 0;         // person's social insurance number
    }


    public Person( String fName, String lName, int age, int sin) {
        firstName = fName;
        lastName = lName;
        /* The "this" keyword specifies that you are referencing the class
         * attribute age rather than the method argument age.
         */
        this.age = age;
        this.sin = sin;
    }

    // get and set methods for each attribute could be here too...

    public String toString() {
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

    @Override
    public boolean equals( Object obj ) {
        boolean result = false;
        // test compatibility
        if ( obj instanceof Person ) {
            Person p = (Person) obj; // cast the object as a person
            // Compare the person attributes.
            if ( firstName.equals( p.firstName ) && lastName.equals( p.lastName ) && age == p.age && sin == p.sin ) {
                result = true;
            }
        }
        return result;
    }

    public int compareTo(Person p){
        return Integer.compare(sin,p.sin);
    }

    @Override
public Person clone(){
        Person copy= null;
        try{
            copy= (Person)super.clone();

        }catch(CloneNotSupportedException e){
            System.out.println("Error");
        }
        return copy;
        }
}