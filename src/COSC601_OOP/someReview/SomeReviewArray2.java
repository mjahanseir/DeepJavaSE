package someReview;

public class SomeReviewArray2 {
    public static void main(String[] args) {
        //array is ref type
        //parameter passing in java by passing by value

//        EVERY THING PASS BY VALUE
        int[] myList = new int[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100);
        }

        System.out.println("The Smallest value in array is : " + min(myList));


        System.out.println("***************");


        //Array References


        int x = 100;

        System.out.println("Array before calling method");

        for (int item : myList) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("primitive before calling method " + x);

        update(myList);

        System.out.println("Array after calling method");

        for (int item : myList) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("primitive after calling method " + x);


    }


    public static int min(int[] inArray) {
        int min = inArray[0];
        for (int i = 0; i < inArray.length; i++) {
            if (min < inArray[i])
                min = inArray[i];
        }
        return min;
    }

    public static void update(int[] inArray) {
        inArray[1] = 0;
        inArray[6] = 0;

    }

}
