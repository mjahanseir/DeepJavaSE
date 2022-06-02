package JUnitSetup;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJUnit {

    String message="Hello World!";
    Messager messenger = new Messager(message);

    @Test
    public void testMessage(){
        assertEquals(message,messenger.printMessage());

    }
}
