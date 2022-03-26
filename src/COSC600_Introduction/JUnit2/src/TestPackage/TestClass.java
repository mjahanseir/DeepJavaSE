package TestPackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {

    @Test
    public void testPrintMessage(){
        assertEquals("g",TestMethods.printMessage("Test String"));
        assertNotEquals("q",TestMethods.printMessage("Another One"));

    }
}
