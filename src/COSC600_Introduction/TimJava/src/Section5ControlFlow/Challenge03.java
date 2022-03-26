package Section5ControlFlow;

public class Challenge03 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int i=1; i<=100;i++){
            if (i%3==0 && i%5==0) {
                System.out.println(i + " ");
                count++;
                sum += i;
            }
            if (count==5)
                break;
        }
        System.out.println("Sum = "+ sum);
    }
}
