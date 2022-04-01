package UnitTesting;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class C22TestMethods {

    int x=5;
    int y=10;
    int z=8;





    // FOR SMALLEST METHOD

    @Test
    public void testSmallestMethodForCorrectOutput(){
        assertEquals(x, C21MethodsClass.smallest(x,y,z));
        // we can add other section and testing in a single method
        assertNotEquals(y , C21MethodsClass.smallest(x,y,z));
        System.out.println("Test2");
    }
    // or we can write separate method
    @Test
    public void testSmallestMethodForNotProducingIncorrectOutput(){
        assertNotEquals(y , C21MethodsClass.smallest(x,y,z));
        System.out.println("Test1");

    }

    ////////////////////////////////////////////////////////////////////


    int xx=5;
    int yy=11;
    int zz=8;
    // FOR AVERAGE
    @Test
    public void testAverageMethodToCheckCorrectResult(){
        assertEquals(4.5 , C21MethodsClass.average(2,4,7.5), 0.01);
        System.out.println("Test3");

    }

    ///////////////////   TDD
    @Test
    public void testMiddleMethod(){
        String testcase1="This is a string"; ////// EVEN case
        String testcase2="This string";      //////  ODD case

        assertEquals(" a", C21MethodsClass.middle(testcase1));
        assertEquals("s", C21MethodsClass.middle(testcase2));
        System.out.println("Test4");

    }

//////////////////////////////////////////////////////////////////////////////

    @Before
    public void before(){
        System.out.println("Execute before methods");
    }

    @After
    public void after(){
        System.out.println("Execute After methods");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Execute at the start");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Execute At the End");
    }

    @Test(expected = NumberFormatException.class)
    public void testAnAnException(){
        assertEquals(1,Integer.parseInt("Whatever"));
    }
}
