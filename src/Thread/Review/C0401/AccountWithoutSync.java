package Thread.Review.C0401;

import java.util.concurrent.*;

public class AccountWithoutSync {
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
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            int newBalance = balance + amount;

            // This delay is deliberately added to magnify the
            // data-corruption problem and make it easy to see.
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException ex) {
            }

            balance = newBalance;
        }
    }
}
