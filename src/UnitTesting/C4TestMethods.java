package UnitTesting;
import org.junit.Test;
import static org.junit.Assert.*;

public class C4TestMethods {

    int x=5;
    int y=10;
    int z=8;


    // FOR SMALLEST METHOD

    @Test
    public void testSmallestMethodForCorrectOutput(){
        assertEquals(x,C3MethodsClass.smallest(x,y,z));
        // we can add other section and testing in a single method
        assertNotEquals(y , C3MethodsClass.smallest(x,y,z));
    }
    // or we can write separate method
    @Test
    public void testSmallestMethodForNotProducingIncorrectOutput(){
        assertNotEquals(y , C3MethodsClass.smallest(x,y,z));
    }

    ////////////////////////////////////////////////////////////////////


    int xx=5;
    int yy=11;
    int zz=8;
    // FOR AVERAGE
    @Test
    public void testAverageMethodToCheckCorrectResult(){
        assertEquals(4.5 , C3MethodsClass.average(2,4,7.5), 0.01);
    }


    ///////////////////   TDD

    @Test
    public void testMiddleMethod(){
        String testcase1="This is a string"; ////// EVEN case
        String testcase2="This string";      //////  ODD case

        assertEquals(" a", C3MethodsClass.middle(testcase1));
        assertEquals("s", C3MethodsClass.middle(testcase2));
    }

}
