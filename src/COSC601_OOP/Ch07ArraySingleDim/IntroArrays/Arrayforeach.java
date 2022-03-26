package Ch07ArraySingleDim.IntroArrays;

public class Arrayforeach {
    public static void main(String[] args) {

        double[] myList=new double[10];

        for (int i=0;i<myList.length;i++){
            myList[i]=Math.random()*100;
        }

        for (double key: myList ) {
            System.out.println(key);
        }

        for (double key: myList ) {
            key=0;
        }

        for (double key: myList ) {
            System.out.println(key);
        }

    }
}
