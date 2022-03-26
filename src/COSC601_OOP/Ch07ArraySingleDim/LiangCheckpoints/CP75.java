package Ch07ArraySingleDim.LiangCheckpoints;

public class CP75 {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] dest= new int[3];


        System.arraycopy(source,0, dest,0,source.length);
        int[] myList;
        myList = new int[10];
// Sometime later you want to assign a new array to myList
        myList = new int[20];


        printArray(myList);
    }
    public static void printArray(int[] input){
        for (int i: input)
            System.out.print( i +" ");
        System.out.println();
    }
}
