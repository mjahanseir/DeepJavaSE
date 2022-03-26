package zBrightSpace.LO5_Polymorphism.LO5LS3Quiz535;

public class Q4 {
    public static void main(String[] args) {
        //  BBBB b = new AAAA();   //  ERRor

    }
}
class AAAA {
    public void stump() {
        System.out.println( "Stump is cool" );
    }
}

class BBBB extends AAAA
{
    public void stump() {
        System.out.println( "It takes stump" );
    }
}