package Thread.Review.C0404;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class C1_AccountWithSync {
    private static Account account = new Account();

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();

        // Create and launch 100 threads
        for (int i = 0; i < 100; i++) {
            executor.execute(new AddAPennyTask());
        }

        executor.shutdown();

        // Wait until all tasks are finished
        /*
        The program repeatedly checks whether all tasks are completed in lines below.
         */
        while (!executor.isTerminated()) {
        }

        //  The account balance is displayed in line 20 after all tasks are completed.
        System.out.println("What is balance? " + account.getBalance());
    }

    // A thread for adding a penny to the account
   /*
     The classes AddAPennyTask and Account in lines below are inner classes.
     Line (private static Account account = new Account();) creates an Account with initial balance 0.
      Line (for (int i = 0; i < 100; i++) ) creates a task to add a penny to the account and
    submits the task to the executor.
    */
    private static class AddAPennyTask implements Runnable {
        public void run() {
            account.deposit(1);
        }
    }


    //////////////////////////////////////////////////////////
    // An inner class for account
    private static class Account {

        ////////////////////////////////  STEP1 :
        //Declare a re-entrant lock
        private static Lock lock = new ReentrantLock(); // Create a lock
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {

            ////////////////////////////        STEP2:
            //Initite the lock before we start
            // doing anything with resource we want to protect
            lock.lock(); // Acquire the lock

            try {

                int newBalance = balance + amount;

                Thread.sleep(3);

                balance = newBalance;

            }
            catch (InterruptedException ex) {
            }
            finally {
                /////////////////////////////      Step3:
                // Once we know we have completed
                //we can release the lock
                lock.unlock(); // Release the lock

            }

        }
    }
}
