public class Q5 {


    public static void main(String[] args) {

        printPITable(5);
    }
    public static double calculatePI(int i){

        double pi = 0;
        double divider = 1;

        for (int x = 0; x < i; x++) {

            if (x % 2 == 0) {
                pi = pi + (1 / divider);
            } else {
                pi = pi - (1 / divider);
            }
            divider = divider + 2;
        }
        pi = pi * 4;
        return pi;
    }
    public static void printPITable(int n){
        System.out.println("Calculating PI table:");
        for (int i=0; i<=n;i++){
            System.out.printf("PI for  %d =  %.4f \n" ,i , calculatePI(i));
        }
    }
}