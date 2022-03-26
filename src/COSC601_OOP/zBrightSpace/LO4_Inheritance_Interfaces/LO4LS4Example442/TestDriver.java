package zBrightSpace.LO4_Inheritance_Interfaces.LO4LS4Example442;

public class TestDriver {

    public static void main( String[] args )
    {
        Person jane = new Person( "Jane", "Doe", 31, 649123971);
        Person jon  = new Person( "Jon", "Doe", 32, 649123971);
        Person jon2 = new Person( "Jon", "Doe", 32, 649123971);

        if ( jane.equals( jon ) ){
            System.out.println( "Jane and Jon are the same" );
        }else{
            System.out.println( "Jane and Jon are the different" );
        }

        if ( jon.equals( jon2 ) ){
            System.out.println( "Jon and Jon2 are the same" );
        }else {
            System.out.println( "Jon and Jon2 are the different" );
        }
    }
}
