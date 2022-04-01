package UnitTesting;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class C2TestMessenger {
    String message="Hello world";
    C1Messenger messenger= new C1Messenger(message);

    @Test
    public void testMessengerObjectCreatedSuccessfully(){

        //assertEquals(Value Expecting, Value produce );
        assertEquals(message, messenger.printMessenger() );

    }

}
