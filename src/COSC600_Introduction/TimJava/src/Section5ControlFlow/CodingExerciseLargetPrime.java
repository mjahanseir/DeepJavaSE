package Section5ControlFlow;

public class CodingExerciseLargetPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime(int number){
        int max=-1;
        if (number<=1)
            return max;
        for (int i=2; i<number; i++)
            if (number%i==0)
                max=i;

        return max;

    }
}
