package Ch07ArraySingleDim.ArraysWithMethods;

public class ArrayRefrencesCorrect {
    public static void main(String[] args) {

        int[] myList = new int[10];
        int[] anotherList;

        int x = 100;

        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100);
        }
        System.out.println("myList Before Calling the method");

        for (int item: myList)
            System.out.print(item+ " ");

        anotherList=updateWithNewArray(myList);
        System.out.println("myList After Calling the method");

        for (int item: myList)
            System.out.print(item+ " ");
        System.out.println("another Before Calling the method");

        for (int item: anotherList)
            System.out.print(item+ " ");

    }

    public static int[] updateWithNewArray(int[] inArray){
        int[] newArray= new int[inArray.length];
        System.arraycopy(inArray,0,newArray,0,inArray.length);
        newArray[1]=0;
        newArray[6]=0;
        return newArray;
    }
}
