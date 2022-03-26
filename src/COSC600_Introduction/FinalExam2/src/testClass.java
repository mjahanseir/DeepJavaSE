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


    // Test Q8
    @Test
    public void isPallyPrimeTest(){
        assertTrue(Q8.isPallyPrime(131));
        assertFalse(Q8.isPallyPrime(13));

    }


   // Test Q9
    @Test
    public void creditCardTest(){

        long invalidTest= 4388576018402626l;
        long validTest= 4388576018410707l;

        assertFalse(Q9.isValid(invalidTest));
        assertTrue(Q9.isValid(validTest));


    }



}
