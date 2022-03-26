package zBrightSpace.LO4_Inheritance_Interfaces.LO4LS6Example461;

public class TestDriver
{
    public static void main( String[] args )
    {
        /*
         * We can say that an Employee is-A Comparable and a
         * Manager is-A Comparable.  We can also say that a Comparable is-A
         * Object since all java objects inherit from the Object class.
         */
        Comparable jane = new Employee( "Jane", "Doe", 31, 649123971, 80, 8.5);
        Comparable boss = new Manager( "Boss", "Hog", 34, 649123978, 45000.0);
        Comparable jane2 = new Employee( "Jane2", "Doe", 31, 649123971, 80, 8.5);

        System.out.println();  // blank line
        System.out.println( jane );
        System.out.println( boss );
        System.out.println( jane2 );

        int compare1 = jane.compareTo( boss );
        System.out.println();  // blank line
        System.out.println( "Compare jane to boss=" + compare1 );
        System.out.println( "--expected result is < 0" );

        int compare2 = boss.compareTo( jane );
        System.out.println();  // blank line
        System.out.println( "Compare boss to jane=" + compare2 );
        System.out.println( "--expected result is > 0" );

        int compare3 = jane.compareTo( jane2 );
        System.out.println();  // blank line
        System.out.println( "Compare jane to jane2=" + compare3 );
        System.out.println( "--expected result is 0" );
    }
}

