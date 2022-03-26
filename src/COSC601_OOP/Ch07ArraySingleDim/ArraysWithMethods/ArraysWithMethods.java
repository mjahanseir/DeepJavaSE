package Ch07ArraySingleDim.ArraysWithMethods;

public class ArraysWithMethods {
    public static void main(String[] args) {
        int[] myList= new int[10];

        for (int i=0; i< myList.length;i++){
            myList[i]=(int)(Math.random()*100);
        }

        System.out.println("the smallest value in array is: "+ min(myList));
    }

    public static int min(int[] inArray){
        int min= inArray[0];
        for (int i=1; i<inArray.length ;i++){
            if(min>inArray[i]){
                min=inArray[i];
            }
        }
        return min;
    }
}
