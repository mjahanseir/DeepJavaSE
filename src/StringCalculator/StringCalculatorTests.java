package StringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTests {

    //////////////////////////////////////////////Step 1
    //Requirement 1: Create a simple string calculator with a method
    // add(String number

    @Test
    @DisplayName("Create the Add Method so we can execute tests")
    public void testCreateAddMethod() {
        assertEquals(1, StringCalculator.add("1"));
    }

    ///////////////////////////////////////////////STEP3
    //Requirement 2 : The method can take 0, 1  or 2 numbers seperated by comma
    //SEE UPDATE at REQUIREMENT #5 .... test disabled
//    @Test
//    @DisplayName("When more than 2 Numbers entered, throw an exception")
//    public void testRequirement2a() {
//        assertThrows(RuntimeException.class, () -> StringCalculator.add("1,2,3"));
//    }

    @Test
    @DisplayName("When correct parameters entered, then no exception")
    public void testRequirement2b() {
        StringCalculator.add("1,2");
        assertTrue(true);
    }

    @Test
    @DisplayName("When a non-number entered, then an exception")
    public void testRequirement2c() {
        assertThrows(RuntimeException.class, () -> StringCalculator.add("1,Z"));
    }


    ///////////////////////////////////////////////STEP3
    //Requirement 3 :  For an EMPTY  string thr method will return 0
    @Test
    @DisplayName("When empty string passed then return 0")
    public void testRequirement3() {
        assertEquals(0, StringCalculator.add(""));
    }

    ///////////////////////////////////////////////STEP4
    //Requirement 4 :  Method will return the sum of the numbers
    @Test
    @DisplayName("When one number entered, then returned that number")
    public void testRequirement4a() {
        assertEquals(6, StringCalculator.add("6"));
    }

    @Test
    @DisplayName("When two number entered, then returned that number")
    public void testRequirement4b() {
        assertEquals(11, StringCalculator.add("6 ,5"));
    }



    //20220311////////////////////////////////////////////STEP5

    // Requirement 5 :  allow the add method to handle an unknown amount of numbers
    @Test
    @DisplayName("When any amount of numbers entered then return the sum of them")
    public void testRequirement5() {
        assertEquals(3+6+9+12+15+20, StringCalculator.add("3,6,9,12,15,20"));
    }

    // Requirement 6 :  allow the add method to handle a new line between numbers
    @Test
    @DisplayName("When new line used between numbers then return the their sum")
    public void testRequirement6() {
        assertEquals(3+6+15, StringCalculator.add("3,6\n15"));
    }

    // Requirement 7 :  Support different DELIMITER
    // ex. if user enters  //;1;2;3 this changes the delimiter to ;
    @Test
    @DisplayName("When special sequence is used then change the delimiter")
    public void testRequirement7() {
        assertEquals(6, StringCalculator.add("//;1;2;3"));
    }


    // Requirement 8 :  Negative numbers will throw an exception
    @Test
    @DisplayName("When negative numbers used then throw an exception")
    public void testRequirement8() {
        assertThrows(RuntimeException.class, ()-> StringCalculator.add("3,-6,9,12,15,20"));
    }


    // Requirement 9 :  Numbers larger than 1000 should be ignored
    @Test
    @DisplayName("When numbers greater than 1000 entered then ignore them")
    public void testRequirement9() {
        assertEquals(5+5, StringCalculator.add("5,1001,5"));
    }


}
