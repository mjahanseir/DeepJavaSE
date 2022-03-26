public class Q8 {

    public static boolean prime(int nVal){

        for (int i=2 ; i<=nVal/2 ; i++){
            if (nVal%i==0)
                return false;
        }
        return true;
    }
    public static boolean isPallyPrime(int nVal){

        while (prime(nVal)){
            // nVal=131
            //Step1: reminder=131%10=1, sum=(0*10)+1=1 , nVal =131/10=13 => reminder=1 sum=1  nVal =13
            //Step2: reminder=13%10=3, sum=(1*10)+3=13 , nVal =13/10=1   => reminder=3 sum=13 nVal =1
            //Step3: reminder=1%10=1, sum=(13*10)+1=131, nVal =1/10=0    => reminder=1 sum=131 nVal =0 X => Break the CONDITION
            int reminder;
            int sum=0;
            int temp=nVal;
            while(nVal>0){
                reminder=nVal%10;
                sum=(sum*10)+reminder;
                nVal/=10;
            }
            //Check sum and input
            if(temp==sum)
                return true;
            else
                return false;
        }
        return false;
    }
}
