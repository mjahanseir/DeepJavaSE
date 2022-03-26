package zBrightSpace.LO4_Inheritance_Interfaces.LO4LS5Example451;

public class TestDriver
{
    public static void main( String[] args )
    {
        /*
         * We can no longer instatiate Person objects, we must create
         * either Employee or Manager objects.
         * The following line will cause a compiler error if you uncomment it
         */
        // Person jon  = new Person( "Jon", "Doe", 32, 649123971);
        Employee jane = new Employee( "Jane", "Doe", 31, 649123971, 80, 8.5);
        Manager boss = new Manager( "Boss", "Hog", 31, 649123971, 45000.0);
        System.out.println( jane.getFormattedName() );
        System.out.println( boss.getFormattedName() );
    }
}
