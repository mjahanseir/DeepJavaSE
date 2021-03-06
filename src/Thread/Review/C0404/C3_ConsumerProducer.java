package Thread.Review.C0404;

import java.util.LinkedList;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class C3_ConsumerProducer {

    private static Buffer buffer = new Buffer();

    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////   E
        // Create a thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new ProducerTask());
        executor.execute(new ConsumerTask());
        executor.shutdown();
    }
/////////////////////////////////////////////////////////////////   C
    // A task for adding an int to the buffer
    private static class ProducerTask implements Runnable {
        public void run() {
            try {
                int i = 1;
                while (true) {
                    System.out.println("Producer writes " + i);
                    buffer.write(i++); // Add a value to the buffer
                    // Put the thread into sleep
                    Thread.sleep((int)(Math.random() * 10000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
/////////////////////////////////////////////////////////////////   D

    // A task for reading and deleting an int from the buffer
    private static class ConsumerTask implements Runnable {
        public void run() {
            try {
                while (true) {
                    System.out.println("\t\t\tConsumer reads " + buffer.read());
                    // Put the thread into sleep
                    Thread.sleep((int)(Math.random() * 10000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }



 ///////////////////////////////////////////////////////////////////////// A
    // An inner class for buffer
    private static class Buffer {
        //////////////////////step 1:
         // buffer size
        private static final int CAPACITY = 1;
        private LinkedList<Integer> queue = new LinkedList<>();
        /////////////////////step 2 create a lock as a shares
        // Create a new lock
        private static Lock lock = new ReentrantLock();

        // Create two conditions
        private static Condition notEmpty = lock.newCondition();
        private static Condition notFull = lock.newCondition();

        /////////////////////step3 : implement 2 methods : read and write
        public void write(int value) {
            lock.lock(); // Acquire the lock
            try {
                while (queue.size() == CAPACITY) {
                    System.out.println("Wait until buffer is no longer full");
                    // CALL AWAIT() WHEREVER WE NEED OUR CODE TO PAUSE
                    notFull.await();
                }
                queue.offer(value);////// for linklist we use offer
                notEmpty.signal(); // Signal notEmpty condition
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock(); // Release the lock
            }
        }
        public int read() {
            int value = 0;
            lock.lock(); // Acquire the lock
            try {
                while (queue.isEmpty()) {
                    System.out.println("\t\t\tWait until buffer is no longer empty");
                    notEmpty.await();
                }
                value = queue.remove();
                notFull.signal(); // Signal notFull condition
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock(); // Release the lock
                return value;
            }
        }
    }
}
