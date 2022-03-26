package someReview;

public class ArrayReference2 {
    public static void main(String[] args) {

        int[] list = new int[4];

        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 100);

        int x = 100;

        System.out.println("Array before calling method");

        for (int item : list)
            System.out.print(item + " ");
        System.out.println();


            uptodate(list);

            System.out.println("Array after calling method");

            for (int item : list)
                System.out.print(item + " ");
            System.out.println();


        System.out.println("primitive before calling method " + x);
uptodatePrim(x);
            System.out.println("primitive after calling method " + x);


    }

    public static void uptodate(int[] inArray) {
        inArray[0] = 0;
        inArray[2] = 0;

    }

    public static void uptodatePrim(int val) {
        val=0;

    }

}
