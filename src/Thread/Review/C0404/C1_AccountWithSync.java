package Thread.Review.C0404;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class C1_AccountWithSync {
    private static Account account = new Account();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executor.execute(new AddAPennyTask());
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("What is balance? " + account.getBalance());
    }
    private static class AddAPennyTask implements Runnable {
        public void run() {
            account.deposit(1);
        }
    }

    //////////////////////////////////////////////////////////
    private static class Account {
        ////////////////////////////////  STEP1 :
        //Declare a re-entrant lock
        private static Lock lock = new ReentrantLock();
        private int balance = 0;

        public int getBalance() {
            return balance;
        }
        public void deposit(int amount) {

            ////////////////////////////        STEP2:
            lock.lock();
            try {
                int newBalance = balance + amount;
                Thread.sleep(3);
                balance = newBalance;
            }
            catch (InterruptedException ex) {
            }
            finally {
                /////////////////////////////      Step3:
                lock.unlock(); // Release the lock

            }
        }
    }
}
