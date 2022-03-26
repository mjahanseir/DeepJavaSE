package someReview;

public class ArrayReferenceCorrect {
    public static void main(String[] args) {

        int[] list = new int[4];
        int[] another;

        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 100);


        System.out.println("list BEFORE calling the Method:");

        for (int item:list)
            System.out.print(item + " ");

        System.out.println();

        another=updateWithNewArray(list);

        System.out.println("list AFTER calling the Method:");

        for (int item:list)
            System.out.print(item + " ");
        System.out.println();

         System.out.println("another AFTER calling the Method:");

        for (int item:another)
            System.out.print(item + " ");
        System.out.println();


    }

    public static int[] updateWithNewArray(int[] inArray) {
        int[]  newArray= new int[inArray.length];

        System.arraycopy(inArray,0, newArray,0 , inArray.length);
       newArray[1]=0;
       newArray[2]=0;

        return newArray;
    }

}
