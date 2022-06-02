package JunitSetup;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message="Hello World!";
    Messenger messenger = new Messenger(message);

    @Test
    public void testPrintMessage(){
        assertEquals(message, messenger.printMessage());
    }
}
