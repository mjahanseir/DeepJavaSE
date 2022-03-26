package Ch07ArraySingleDim.ArraysWithMethods;

public class ArrayRefrences {
    public static void main(String[] args) {

        int[] myList = {1,2,3,4,5};
        int x = 100;

        System.out.println("mylist before calling Method: ");

        for (int item : myList)
            System.out.print(item + " ");
        System.out.println();

        update(myList);

        System.out.println("myList  after call");
        for (int item : myList)
            System.out.print(item + " ");

        System.out.println();

        System.out.println("Primitive before call method: " + x);

        updatePrimitive(x);
        System.out.println("Primitive after call method: " + x);


    }

    public static void update(int[] inArray) {
        inArray[1] = 0;
        inArray[3] = 0;
    }

    public static void updatePrimitive(int inVal) {
        inVal = 0;
    }
}
