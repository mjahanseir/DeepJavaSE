package UnitTesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class C23TestMethodJunit5 {
    int x=5;
    int y=11;
    int z=8;

    @Test
    @DisplayName("Test method smallest() to ensure correct output") ///// show name as we want in menu
    public void testSmallest(){
        assertEquals(x, C21MethodsClass.smallest(x,y,z));
        assertNotEquals(y, C21MethodsClass.smallest(x,y,z));
    }

    @Test
    public void testAverageMethod(){
        assertEquals(4.5, C21MethodsClass.average(2,4,7.5), 1.01);
        System.out.println("Test3");
    }

    @BeforeEach
    public void before(){
        System.out.println("Execute before methods");
    }


    @AfterEach
    public void after(){
        System.out.println("Execute After methods");
    }

    @Test
    public void testException(){
       //                assertThrows(NumberFormatException.class, ()->Integer.parseInt("Whatever"));   //Lambda expression to show
       // ------  OR >>  assertThrows(Exception.class, ()->Integer.parseInt("Whatever"));   //Lambda expression to show
        assertThrows(IOException.class, ()->Integer.parseInt("Whatever"));   //Lambda expression to show
    }


}
