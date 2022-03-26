public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%2d  ", i*j);
            }
            System.out.printf("\n");
        }

        System.out.println("*************    a        ******************");

        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
        }

        System.out.println("************     b        *******************");


        int i = 0;
        while (i < 5) {
            for (int j = i; j > 1; j--)
                System.out.print(j + " ");
            System.out.println("****");
            i++;
        }




        System.out.println("**************    c      *******************");


        int i3 = 5;
        while (i3 >= 1) {
            int num = 1;
            for (int j = 1; j <= i3; j++) {
                System.out.print(num + "xxx");
                num *= 2;
            }

            System.out.println();
            i3--;
        }

        System.out.println("************   d          ***************");

        int i4 = 1;
        do {
            int num = 1;
            for (int j = 1; j <= i4; j++) {
                System.out.print(num + "G");
                num += 2;
            }

            System.out.println();
            i4++;
        } while (i4 <= 5);






        System.out.println("\n\n\n\n");


        // Initialize sum
        float sum = 0;

        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (float a = 0.01f; a <= 1.0f; a = a + 0.01f)
            sum += a;

        // Display result
        System.out.printf("The sum is %.2f" , sum);


    }
}
