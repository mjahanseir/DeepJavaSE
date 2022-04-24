package Thread.Review;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerProgram {

    public static void main(String[] args) {

    }//END OF main

    /**  adding an int to the buffer */
    private static class Producer implements Runnable{
        @Override
        public void run() {
        }
    }// END OF PRODUCER
    /** reading and deleting an int from the buffer */
    private static class Consumer implements Runnable{
        @Override
        public void run() {
        }
    }// END OF CONSUMER

    /** n inner class for buffer */
    private static class Buffer{
        private static final int CAPACITY = 1; // buffer size
        private LinkedList<Integer> queue = new LinkedList<>();

        private static Lock lock= new ReentrantLock();
        private static Condition noEmpty= lock.newCondition();
        private static Condition noFull= lock.newCondition();

        public void write(int value){
            lock.lock(); // Acquire the lock
            try {
                while (queue.size() == CAPACITY) {
                    System.out.println("Wait for notFull condition");
                    noFull.await();
                }
                queue.offer(value);
                noEmpty.signal();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        public int read(){}
    }// END OF BUFFER

}//END OF CLASS
