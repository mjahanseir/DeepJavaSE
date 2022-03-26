import java.text.NumberFormat;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        //  Class Exc.
        // 09/01/2021
        
        System.out.println("Hello World");
        System.out.println(5);
        System.out.println("5");
        System.out.println('5');
        System.out.println("String Type: "+"5+5");
        System.out.println("5+5=" + (5+5));

        System.out.println("*****************");

//        int[] intArray= new int[10];
        int[] intArray= {11,20,3,4,5,6,7,8,9,10};
        boolean[] boolArray= new boolean[10];
        System.out.println(intArray.length);
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.toString(boolArray));


        System.out.println("\n##############################\n");

        int [][] numbers= new int[2][3];
        int [][] numbers2= {{1,2,3},{4,5,6} };
        numbers[0][1]=1;
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.deepToString(numbers2));

        System.out.println("\n##############################\n");

        final float pi=3.1415F;
        System.out.println(pi);

        System.out.println("\n##############################\n");

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result=percent.format(0.01);
        System.out.println(result);

    }
}
