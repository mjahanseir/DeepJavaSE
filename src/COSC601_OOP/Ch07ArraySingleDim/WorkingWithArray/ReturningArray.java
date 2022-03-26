package Ch07ArraySingleDim.WorkingWithArray;

public class ReturningArray {
    public static void main(String[] args) {

        int[] myarr= {1,2,3,4,5};
        int[] myarr2=reverse(myarr);
        for (int i : myarr) System.out.print(i + " ");
        System.out.println();
        for (int i : myarr2) System.out.print(i + " ");
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        int maxIndex=list.length-1;
        for (int i = 0;i < list.length; i++) {
            result[maxIndex] = list[i];
            maxIndex--;
        }
        return result;
    }

}
