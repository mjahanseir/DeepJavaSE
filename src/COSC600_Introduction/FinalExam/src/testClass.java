import org.junit.Test;

import static org.junit.Assert.*;

public class testClass {

    // Test Q7
    @Test
    public void sumDigitTest(){
        int digit =4351;
        int sum=4+3+5+1;
        assertEquals(sum, Q7.sumDigits(digit));

        digit =973654281;
        sum=9+7+3+6+5+4+2+8+1;
        assertEquals(sum, Q7.sumDigits(digit));
    }


}
