package Thread.Review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
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
        private static Lock lock= new ReentrantLock(); //A lock is created
        // The deposit task acquires the lock in line 76
//and signals all waiting threads (line 83) for the newDeposit condition after a new deposit
//is made.
        private static Condition newDeposit = lock.newCondition(); // A condition named newDeposit on the lock is created
        // A condition is bound to a lock. Before waiting or signaling the condition,
        // a thread must first acquire the lock for the condition.
        private int balance=0;

        public int getBalance() {
            return balance;
        }

        public void withdraw(int amount){
            //The withdraw task acquires the lock , waits for the newDeposit condition
            // when there is not a sufficient amount to withdraw, and releases the lock.
            lock.lock();
            try {
                while (balance<amount){
                    System.out.println(" 	*********	  WAIT  	*********	");
                    newDeposit.await();
                }
                balance-=amount;
                System.out.println("\t\t\t   Withdraw  "+ amount + "\t\t "+ getBalance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        public void deposit(int amount){
            lock.lock();
            try {
                balance+=amount;
                System.out.println("Deposit  " + amount + "\t\t\t\t"+ getBalance());
                newDeposit.signalAll();
            }finally {
                lock.unlock();
            }
        }
    }//END OF Account
}// END OF CLASS
