package Thread.Review.C0404;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class C2_ThreadCooperation {

    private static Account account = new Account();


    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////////  B

        // Create a thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new DepositTask());
        executor.execute(new WithdrawTask());
        executor.shutdown();

        System.out.println("Thread 1\t\tThread 2\t\tBalance");
    }

    /////////////////////////////////////////////////////////////////////////  C
    // A task for adding an amount to the account
    public static class DepositTask implements Runnable {
        @Override
        public void run() {
            try { // Purposely delay it to let the withdraw method proceed
                while (true) {
                    account.deposit((int)(Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    /////////////////////////////////////////////////////////////////////////  D
    // A task for subtracting an amount from the account
    public static class WithdrawTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                account.withdraw((int)(Math.random() * 10) + 1);
            }
        }
    }




/////////////////////////////////////////////////////////////////////////  A
    // An inner class for account
    private static class Account {

        /////////////////////     Step 1:
        // //////////////////            create a lock object
        // Create a new lock
        private static Lock lock = new ReentrantLock();
        ///////////////////// use the lock to create a condition that the lock will use
        ///////////////////// any method issuing a lock will be subject to what the condition does
        // Create a condition
        private static Condition newDeposit = lock.newCondition();

        private int balance = 0;

        public int getBalance() {
            return balance;
        }



    /////////////////////////////////////////////////////////////////////////  E
        public void withdraw(int amount) {
            lock.lock(); // Acquire the lock
            try {
                while (balance < amount) {
                    System.out.println("\t\t\tWait for a deposit");
                    newDeposit.await(); ////  wait
                }
                balance -= amount;
                System.out.println("\t\t\tWithdraw " + amount + "\t\t" + getBalance());
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock(); ////////////////////////     Release the lock
            }
        }
    /////////////////////////////////////////////////////////////////////////  F

        public void deposit(int amount) {
            lock.lock(); // Acquire the lock
            try {
                balance += amount;
                System.out.println("Deposit " + amount +   "\t\t\t\t\t" + getBalance());

                // Signal thread waiting on the condition
                newDeposit.signalAll();
            }
            finally {
                lock.unlock(); // Release the lock
            }
        }
    }
}
