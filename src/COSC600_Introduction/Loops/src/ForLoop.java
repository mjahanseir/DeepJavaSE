public class ForLoop {
    public static void main(String[] args) {
        /*
        for (initial state  ;  Stop Condition ;   Step Expression){
            code statements
         }
         */
        int sum1=0;
        int sum2=0;
        for (int i=0;i<10;i++)
            sum1+=i;

        for (int i=0;i<10;++i)
            sum2+=i;

        System.out.println(sum1);
        System.out.println(sum2);

        for (char alpha='a' ; alpha<='z' ; alpha++)
            System.out.print(alpha + " ");


        int mySum=0;
        for (int i=0 ; i<=10 ; i++)
            mySum += i;
        System.out.println(mySum);
    }
}
