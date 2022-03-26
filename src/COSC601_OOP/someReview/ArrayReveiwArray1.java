package someReview;

import java.util.Scanner;

public class ArrayReveiwArray1 {
    public static void main(String[] args) {
        int[] anotherList = new int[10];
        int[] literalList = {1, 2, 3, 4, 5, 6};
        System.out.println(literalList);


        //Process Array
        double[] myList = new double[5];

        for (int i = 0; i < myList.length; i++) {
            // myList.length() parents is wrong
            myList[i] = 10.0;
        }

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 20;
        }

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter " + myList.length + " value.");
//
//        for (int i = 0; i < myList.length; i++) {
//            myList[i] = input.nextDouble();
//        }
        //directly output
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }


        ///Array Example 1

        double[] myList2 = new double[5];
        for (int i = 0; i < myList2.length; i++) {
            myList2[i] = Math.random() * 100;
        }


        double sum = 0.0;
        for (int i = 0; i < myList2.length; i++) {
            sum += myList2[i];
        }
        System.out.println("Sum : " + sum);


        //array Example
        double[] myList3 = new double[5];
        for (int i = 0; i < myList3.length; i++) {
            myList3[i] = Math.random() * 100;
        }
//find the largest value in array

        double largest=myList3[0];
        int largestIndex=0;
        for (int i = 0; i < myList3.length; i++) {
            if(largest<myList3[i]) {
                largest = myList3[i];
                largestIndex = i;
            }
        }
        System.out.println("The Largest value is myList[" + largestIndex+ "] = " + largest + "");


        //foreach

        for(double element: myList3){
            System.out.println(element);
        }

        for(double element: myList3){
            element=0;
        }

        for(double element: myList3){
            System.out.println(element);
        }


        System.out.println("*************");

        // Array copy

        //double[] anotherList2=myList3; // this is wrong copy reference
        double[] anotherList2=new double[5];

        for(int i=0; i<myList3.length; i++){
            anotherList2[i]=myList3[i];

        }
        for(double element: anotherList2){
            System.out.println(element);
        }

        System.arraycopy(myList3, 0, anotherList2,0,myList.length);

    }
}
