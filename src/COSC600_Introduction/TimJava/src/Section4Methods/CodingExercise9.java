package Section4Methods;

public class CodingExercise9 {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid Value");

        long years=minutes/(365*24*60);
        long reminngMinutes= minutes%(365*24*60);
        long days=reminngMinutes/(24*60);
        if(minutes>=5)

            System.out.println(minutes + " min" + " = " + years + " y and " + days + " d");
    }
}
