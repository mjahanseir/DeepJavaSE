package Thread.Review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C4_Account_withLock {

    private static Account account= new Account();
    public static void main(String[] args) {

        ExecutorService executor= Executors.newCachedThreadPool();
        for (int i=1; i<=100; i++){
            executor.execute(new AddPenny());
        }
        executor.shutdown();
        while (!executor.isTerminated()){
        }
        System.out.println("What is balance : "+account.getBalance());
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
        private static Lock lock = new ReentrantLock();

        public int getBalance() {
            return balance;
        }

        public void deposite(int amount) {
            lock.lock();
            int newBalance = balance + amount;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance= newBalance;
            lock.unlock();
        }
        /*
         * Note:
         * How do you create a lock object? How do you acquire a lock and release a lock?
         * To create a lock, use the new ReentrantLock().
         * To acquire the lock, invoke its lock() method and to release it, invoke its unlock() method.
         */
    }//End of Account
}//End of Class