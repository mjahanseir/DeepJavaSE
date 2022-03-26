package Ch07ArraySingleDim.LiangCheckpoints;

public class CP72 {
    public static void main(String[] args) {

        //Array Declaration in Java

        int[] myarr1;
        myarr1=new int[5];

        double myarr2[]= new double[2];
        float f[] = {2.3f, 2.1f, 5.6f};

        for (float i: f){
            System.out.println(i);
        }

        double[] list= new double[10];
        list[9]=5.5;
        System.out.println(list[0]+list[1]);
        double sum=0.0;
        for (int i=0;i<list.length;i++)
            sum+=list[i];
        System.out.println(sum);

        double minValue= list[0];
        for (int i=0;i<list.length;i++) {
            if (minValue > list[i])
                minValue = list[i];
        }
        System.out.println(minValue);

        int randIndex= (int)(Math.random()*10);
        System.out.println(list[randIndex]);


        double[] anotherArray={3.5,5.5,4.52,5.6};

        double[] r= new double[100];
        for (int i = 0; i < r.length; i++)
            r[i] = Math.random() * 100;

    }


}
