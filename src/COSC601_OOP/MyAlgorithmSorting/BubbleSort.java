package MyAlgorithmSorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={5,1,4,2,8,3,7,6};


        boolean flag;
        int temp;
        for (int i=0;i<a.length-2;i++){
            flag=false;
            for (int j=0;j<a.length-2-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
                break;

        }
        for (int i=0;i<=a.length;i++)
            System.out.println(a[i]);

    }
}
