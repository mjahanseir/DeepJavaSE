package Ch07ArraySingleDim.IntroArrays;

public class ArrayExample1 {
    public static void main(String[] args) {

        double[] myList=new double[10];

        for (int i=0;i<myList.length;i++){
            myList[i]=Math.random()*100;
        }

        double sum=0.0;
        for (int i=0;i<myList.length;i++) {
            sum += myList[i];
        }
        System.out.println("The sum is: " + sum);
    }
}
