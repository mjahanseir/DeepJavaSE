package Ch07ArraySingleDim.LiangCheckpoints;

public class CP77 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 4};
        for (int i = 0, j = list.length - 1; i < list.length/2; i++, j--) {
            // Swap list[i] with list[j]
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
printArr(list);
    }
    public static void printArr(int[] input){
        for(int i=0; i< input.length;i++){
            System.out.print(input[i] + "  ");
        }
    }
}
