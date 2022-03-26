package zBrightSpace.LO5_Polymorphism.LO5LS3Quiz535;

public class Q3 {
    public static void main( String[] args )
    {
        AA a = new BB();
        a.stump();
    }
}

class AA
{
    public void stump()
    {
        System.out.println( "Stump is cool" );
    }
}
class BB extends AA
{
    public void stump()
    {
        System.out.println( "It takes stump" );
    }
}