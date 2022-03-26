/*package JUnitAssertion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class Messenger{
    private String message;
    public Messenger(String message) {
        this.message = message;
    }
    public String printMessage() {
        System.out.println(message);
        return message;
    }
}

public class TestJunit {

    String message="hello";
    Messenger messenger= new Messenger(message);
    @Test
    public void testPrintMessage(){
        assertEquals(message, messenger.printMessage());
    }
}
*/
package JUnitAssertion;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunit {

    int num=10;
    String temp=null;
    String str="Junit is working";
    String str2=new String("Junit is working");
    
    double d1= 1.0006;
    double d2= 1.0007;
    @Test
    public void testIfNumIsGreaterThanTen(){
        assertFalse(num>10);
    }
    @Test
    public void testIfNumIsNotGreaterThanTen(){
        assertTrue(num>=10);
    }
    @Test
    public void testIfString(){
        assertEquals(str,str2);
    }
 @Test
    public void testIfDouble(){
        assertEquals(d1,d2, 0.0001);
    }

}