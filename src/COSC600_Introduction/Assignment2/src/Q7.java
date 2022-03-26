public class Q7 {

    public static int sumDigits(int inVal){
        int sum = 0;
        while(inVal>0) {
            sum += inVal % 10;
            inVal /= 10;
        }
        return sum;
    }
}

