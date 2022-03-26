package zBrightSpace.LO4_Inheritance_Interfaces.LO4LS6Example462_Clone;

public class TestDriver
{
    public static void main( String[] args )
    {
        Employee emp = new Employee( "Pat", "Smith", 31, 12345, 40, 10 );
        Employee copy = emp.clone();
        // not same object, so == should yield false
        System.out.println( "emp == copy? " + ( emp == copy ) );
        // has same values so equals should yield true
        System.out.println( "emp.equals( copy )? " + emp.equals( copy ) );
    }
}
