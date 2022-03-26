public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756 , -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175 , -3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3-3.123,3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces(double d1,double d2){
       int x1=(int)(d1*1000);
       int x2=(int)(d2*1000);
        if(x1==x2){
            return true;
    } else
            return false;
    }
}
