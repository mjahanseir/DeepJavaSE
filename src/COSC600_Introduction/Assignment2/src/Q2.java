
public class Q2 {
    public static void main(String[] args) {

        /*
        A positive integer is a perfect number if it is equal to the sum of all its positive divisors.
        For example, six is the first perfect number as it’s divisors are 3,2, and 1, whose sum is 6.
        The next is 28 whose divisors are 14,7,4,2,1.
        There are exactly 4 perfect numbers between 1 and 10,000.
        Write a program, Q2, that determines and displays all these perfect numbers.
         */
        //Variable
        int num=10000;

        System.out.print("Perfect Number between 1 and " + num + " = ");
        perfectNumber(num);

    }

    //create method calculate Perfect Number Between 1-10,000
    public static void perfectNumber(int number) {

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if ((i % j) == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(sum + "  ");
            }
        }
    }
}
