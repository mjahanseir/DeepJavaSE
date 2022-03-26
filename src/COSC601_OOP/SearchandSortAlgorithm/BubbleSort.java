package SearchandSortAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {

        int[] list={2,4,6,1,3};
        bubbleSort(list);
        for (int value : list)
            System.out.println(value + " ");
    }

    public static void bubbleSort(int[] input) {
        boolean morePasses = true;
        for (int i = 1; i < input.length && morePasses; i++) {
            morePasses=false;
            for (int j = 0 ; j < input.length-i; j++) {
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                    morePasses=true;
                    //swap(input[j], input[j+1]);
                }
            }
        }
    }

    public static int[] swap(int a, int b) {

        int[] list=new int[2];
        list[0]=b;
        list[1]=a;
        return list;
    }
}
