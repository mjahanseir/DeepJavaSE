package JUnitAssertion;

import org.junit.*;

public class JunitStructure {


    @Before
    public void before(){
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("After");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
    @Test
    public void test1(){
        System.out.println("Test1");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }
    @Test
    public void test3(){
        System.out.println("Test3");
    }
}
