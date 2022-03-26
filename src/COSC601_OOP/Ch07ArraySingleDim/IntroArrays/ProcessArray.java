package Ch07ArraySingleDim.IntroArrays;

import java.util.Scanner;

public class ProcessArray {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);

        double[] myList=new double[10];

        for (int i=0;i<myList.length;i++){
            myList[i]=10.0;
        }


//        for (int i=0;i<myList.length;i++){
//            myList[i]=Math.random()*20;
//        }


        System.out.println("Enter " + myList + " values: ");
        for (int i=0;i<myList.length;i++){
            myList[i]=input.nextDouble();
        }


        for (int i=0;i<myList.length;i++){
            System.out.print(myList[i]+"  ");
        }


    }
}
