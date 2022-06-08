package SearchandSortAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {1, 9, -2 , 4, 6, 5};
        for(int value: list)
            System.out.print(value + " ");

        System.out.println();

        insertionSort(list);
        for(int value: list)
            System.out.print(value + " ");

    }
    public static void insertionSort(int[] list){

        for (int i=1 ; i<list.length; i++){
            //store the current value
            int currentValue=list[i];

            int j;
            for ( j=i-1; j>0 && list[j]>currentValue  ; j--){
                list[j+1] = list[j];
            }

            list[j+1]= currentValue;
        }

    }
}
