package aaMID601;

public class Q1 {
    public static void main(String[] args) {

        int[] arr = {6, 8, 6, 9, 1, 6, 7};
//test Q1-1
        System.out.println(lastIndexOf(arr, 6));
//test Q1-2
        int[]temp= subArray(arr,1,4);
        for (int i =0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
//test Q1-3
        System.out.println(replace(arr, 6,4));
//test Q1-2
    }

    //Q1-1
    public static int lastIndexOf(int[] inArr, int searchVal) {

        int index = -1;
        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i] == searchVal) {
                index = i;
            }
        }
        return index;
    }

    //Q1-2
    public static int[] subArray(int[] inArr, int start, int end) {
        int len = end - start;
        int[] list = new int[len];
        int counter = 0;
        for (int i = start; i < end; i++) {
            list[counter] = inArr[i];
            counter++;
        }
        return list;
    }

    //Q1-3
    public static boolean replace(int[] inArr, int searchVal, int replaceVal){
        boolean flag=false;
        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i] == searchVal) {
                inArr[i] = replaceVal;
                flag=true;
                break;
            }
        }
        return flag;
    }



}
