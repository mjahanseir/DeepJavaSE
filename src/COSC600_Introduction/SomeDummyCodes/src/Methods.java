public class Methods {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }
        System.out.println("**************************");

// Initialize times
        int times = 3;
        System.out.println("Before the call,"
                + " variable times is " + times);
        // Invoke nPrintln and display times
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call,"
                + " variable times is " + times);


    }
    public static void nPrintln( String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }


    public static void method1(
            int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
}
