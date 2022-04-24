package Thread.Review;

public class C5_ThreadCoOp {
    private static Account account= new Account();

    public static void main(String[] args) {

    }//END OF MAIN
    public static class Deposit implements Runnable{
        @Override
        public void run() {
            try {
                while (true) {
                    account.deposit((int) (Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }//END of Deposit
    public static class Withdraw implements Runnable{
        @Override
        public void run() {
            while (true){
                account.withdraw((int)(Math.random()*10)+1);
            }
        }
    }//END OF Withdraw
    private static class Account{

        public void deposit(int amount){

        }
        public void withdraw(int amount){

        }
    }//END OF Account

}// END OF CLASS
