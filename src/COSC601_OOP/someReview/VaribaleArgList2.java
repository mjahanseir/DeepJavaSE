package someReview;

public class VaribaleArgList2 {
    public static void main(String[] args) {

        print(new double[]{1,2,3,4});
        print(34,99,65,66,19);

    }

    //create array in fly ...
    public static void print(double... number){
        if (number.length==0)
            System.out.println("No args");

        double result= number[0];

        for (int i=0; i<number.length; i++) {
            if (number[i] > result) {
                result = number[i];
            }
        }
            System.out.println("The max is "+ result);

    }
}
