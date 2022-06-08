package SearchandSortAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list={2,4,6,1,3};
        int[] sorted=selectionSort(list);
        for (int value : sorted)
            System.out.println(value + " ");

    }
    public static int[] selectionSort(int[] input){

        for(int i=0; i<input.length;i++){
            int minVal=input[i];
            int minIndex=i;
            for(int j=i+1; j<input.length;j++) {
                if (minVal > input[j]) {
                    minVal = input[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i) {
                input[minIndex] = input[i];
                input[i] = minVal;
            }
        }
        return input;
    }
}
