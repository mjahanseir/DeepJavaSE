package Thread.Review;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C4_Account {
private static Account account= new Account();
    public static void main(String[] args) {

        ExecutorService executor= Executors.newCachedThreadPool();
        for (int i=1; i<=100; i++){
            executor.execute(new AddPenny());
        }
        executor.shutdown();
        while (!executor.isTerminated()){
        }
        System.out.println("What is balance :"+account.getBalance());
    }// End of main

    ///////////////////////////////////////////////////////////
    private static class AddPenny implements Runnable {
        @Override
        public void run() {
            account.deposite(1);
        }
    }
    ///////////////////////////////////////////////////////////
    private static class Account {
        private int balance=0;

        public int getBalance() {
            return balance;
        }

        public void deposite(int amount) {
            int newBalance = balance + amount;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance= newBalance;
        }
    }//End of Account
}//End of Class