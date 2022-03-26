package Ch07ArraySingleDim.WorkingWithArray;

import java.awt.desktop.SystemEventListener;

public class CopyingArray2 {
    public static void main(String[] args) {

        int[] myArr1={1,2,3,4,5,6,7,8,9};
        printArray(myArr1);
        int[] myArr2= new int[10];
        System.arraycopy(myArr1,0, myArr2,3,3);

        printArray(myArr2);
        printArray(myArr1);

    }
    public static void printArray(int[] input){
        for (int i: input)
            System.out.print( i +" ");
        System.out.println();
    }
}
