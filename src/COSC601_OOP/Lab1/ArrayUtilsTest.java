//package Lab1;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class ArrayUtilsTest {
//
//    int[] testArray = {2,5,9,44,7,33,51,16,178};
//    int[] testArray2 = {2,5,9,44,7,33,7,51,16,7,178,7};
//    int[] testReverseArrayExpected = {178,16,51,33,7,44,9,5,2};
//    int[] testOddArrayExpected = {5,9,7,33,51};
//    int[] testArrayCopyArrExpected = {2,5,9,44,7,33,51,16,178};
//    int[] testArrayCopySrc = {43,43,546,687,643,345,534,243,67};
//    int[] testArrayCopyDest = {9,9,9,9,9,9,9,9,9};
//    int[] testArrayCopyExpected = {43,43,546,687,643,345,9,9,9};
//    int[] testArrayReduceExpected = {2,5,9,44,7};
//    int[] testArrayGrowExpected = {2,5,9,44,7,33,51,16,178,0,0};
//
//    @Test
//    public void testMax(){
//        assertEquals(178,ArrayUtils.max(testArray));
//        assertNotEquals(2, ArrayUtils.max(testArray));
//    }
//
//    @Test
//    public void testMin(){
//        assertNotEquals(178,ArrayUtils.min(testArray));
//        assertEquals(2, ArrayUtils.min(testArray));
//    }
//
//
//
//    @Test
//    public void testCountOdd(){
//        assertEquals(5,ArrayUtils.countOdd(testArray));
//    }
//
//    @Test
//    public void testToString(){
//        assertEquals("[2, 5, 9, 44, 7, 33, 51, 16, 178]", ArrayUtils.toString(testArray));
//    }
//
//    @Test
//    public void testRevToString(){
//        assertEquals("[178, 16, 51, 33, 7, 44, 9, 5, 2]", ArrayUtils.reverseToString(testArray));
//    }
//
//    @Test
//    public void testTimesOccur(){
//        assertEquals(4, ArrayUtils.timesOccur(testArray2,7));
//    }
//
//    @Test
//    public void testReverse(){
//        assertArrayEquals(testReverseArrayExpected,ArrayUtils.reverse(testArray));
//    }
//
//    @Test
//    public void testOddValues(){
//        assertArrayEquals(testOddArrayExpected,ArrayUtils.oddValues(testArray));
//    }
//
//    @Test
//    public void testCopyArr(){
//        assertArrayEquals(testArrayCopyArrExpected,ArrayUtils.copyArr(testArray));
//    }
//
//    @Test
//    public void testCopy(){
//        ArrayUtils.copy(testArrayCopySrc,testArrayCopyDest,6);
//        assertArrayEquals(testArrayCopyExpected, testArrayCopyDest);
//    }
//
//    @Test
//    public void testReduce(){
//        assertArrayEquals(testArrayReduceExpected,ArrayUtils.reduce(testArray,5));
//    }
//
//    @Test
//    public void testGrow(){
//        assertArrayEquals(testArrayGrowExpected,ArrayUtils.grow(testArray,2));
//    }
//
//}
