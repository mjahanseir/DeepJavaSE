package Thread.Review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C5_ThreadCoOp {
    private static Account account= new Account();

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new Deposit());
        executorService.execute(new Withdraw());
        executorService.shutdown();
        System.out.println("Thread 1  \t*********\t  Thread 2  \t*********\t  balance");
    }//END OF MAIN
    public static class Deposit implements Runnable{
        @Override
        public void run() {
            try {while (true) { account.deposit((int) (Math.random() * 10) + 1); Thread.sleep(1000); }
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }//END of Deposit
    public static class Withdraw implements Runnable{
        @Override
        public void run() {
            while (true){  account.withdraw((int)(Math.random()*10)+1);}
        }
    }//END OF Withdraw
    private static class Account{
        private Lock lock= new ReentrantLock();

        public void deposit(int amount){

        }
        public void withdraw(int amount){

        }
    }//END OF Account

}// END OF CLASS
