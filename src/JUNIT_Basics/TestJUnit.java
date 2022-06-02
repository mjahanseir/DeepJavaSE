import org.junit.Test;

import static org.junit.Assert.*;

public class TestJUnit {

    int num=10;
    String temp=null;
    String str = "Junit is working";

    @Test
    public void testIfNumGT10(){
        assertEquals(10, num);
    }


}
