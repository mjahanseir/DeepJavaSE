package Thread.Review;
import java.util.LinkedList;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class ProducerConsumerProgram {
    private static Buffer buffer = new Buffer();
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new Producer());
        executorService.execute(new Consumer());
        executorService.shutdown();
    }//END OF main
    /**  adding an int to the buffer */
    private static class Producer implements Runnable{
        @Override
        public void run() {
            try {
                int i=1;
                while(true) {
                    System.out.println("Producer write " + i);
                    Thread.sleep((int) (Math.random() * 1000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
            }catch (InterruptedException ex){  ex.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        public int read(){
            int value = 0;
            lock.lock();
            try {
                while(queue.isEmpty()){
                    System.out.println("\t\t\tWait for notEmpty condition");
                    noEmpty.await();
                }
                value= queue.remove();
                noFull.signal();
            }catch (InterruptedException ex){  ex.printStackTrace();
            }finally {
                lock.unlock();
                return value;
            }
        }
    }// END OF BUFFER
}//END OF CLASS
