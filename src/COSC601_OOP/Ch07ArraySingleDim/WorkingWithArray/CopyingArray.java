package Ch07ArraySingleDim.WorkingWithArray;

public class CopyingArray{
    public static void main(String[] args) {

        double[] myList=new double[10];

        for (int i=0;i<myList.length;i++){
            myList[i]=Math.random()*100;
        }
//        double[] anotherList= myList;// this is wrong
        double[] anotherList= new double[10];

        for (int i=0;i<myList.length;i++) {
            anotherList[i] = myList[i];
        }

System.arraycopy(myList,0, anotherList,0, myList.length);

        anotherList[5]=0;



        for (double element: myList ) {
            System.out.println(element);


        }

    }
}
