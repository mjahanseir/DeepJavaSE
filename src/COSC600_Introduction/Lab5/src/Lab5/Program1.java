package Lab5;

public class Program1 {
    public static void main(String[] args) {

        System.out.println(smallest(2,-1,9));
        System.out.println(smallest(12,20,3));
        System.out.println(smallest(-1,-1,-222));
    }
    public static int smallest(int num1,int num2,int num3){
        int small=0;
        if (num1<=num2) {
            if (num1 <= num3)
                small = num1;
            else
                small=num3;
        }else{
            if(num2<=num3)

                small = num2;
            else
                small = num3;
        }
        /* OR
        if(num1<=num2 && num1<=num3)
            small=num1;
        else if(num2<=num1 &&num2<=num3)
            small=num2;
        else if(num3<=num1 && num3<=num2)
            small=num3;
        */
        return small;
    }
}
