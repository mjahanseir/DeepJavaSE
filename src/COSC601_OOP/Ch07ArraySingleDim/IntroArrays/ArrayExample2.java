package Ch07ArraySingleDim.IntroArrays;

public class ArrayExample2 {
    public static void main(String[] args) {

        double[] myList=new double[10];

        for (int i=0;i<myList.length;i++){
            myList[i]=Math.random()*100;
        }

        double largest=myList[0];
        int largestIndex=0;
        for (int i=1;i<myList.length;i++) {
            if (largest<myList[i]) {
                largestIndex = i;
                largest = myList[i];
            }
        }


        System.out.println("The largest: " + largest );
        System.out.println("The largest Index: " + largestIndex );
    }
}
