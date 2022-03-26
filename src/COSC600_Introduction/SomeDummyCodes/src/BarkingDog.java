public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay < 24) {
            if (barking)
                if (hourOfDay < 8 || hourOfDay > 22)
                    return true;
                else
                    return false;
            else
                return false;

        }else
            return false;
    }
}
