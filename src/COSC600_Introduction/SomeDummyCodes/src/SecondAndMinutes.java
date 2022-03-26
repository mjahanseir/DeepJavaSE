public class SecondAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 55));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "invalid";
        }
        int hour = minutes / 60;
        minutes %= 60;
        return hour + " h " + minutes + " m " + seconds + " s";
    }

    public static String getDurationString(int seconds) {
        if ((seconds < 0)) {
            return "invalid";
        }
        int min = seconds / 60;
        seconds %= 60;
        return getDurationString(min,seconds);
    }
}
