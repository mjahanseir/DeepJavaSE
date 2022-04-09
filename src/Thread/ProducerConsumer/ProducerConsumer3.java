package Thread.ProducerConsumer;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;

class Producer3 extends Thread {
    ArrayBlockingQueue<Integer> queue;
    public Producer3(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }
    public void run() {
        for (Integer i = 0; i < 100; i++) {
            Integer num = (int) (Math.random() * 1000);
            System.out.println("Added: " + num);
            try {
                queue.put(num);
            }catch (InterruptedException e) {
            }
            System.out.println("Added: " + num);
        }
    }
}
class Consumer3 extends Thread {
    ArrayBlockingQueue<Integer> queue;
    public Consumer3(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }
    public void run() {
        for (Integer i = 0; i < 100; i++) {
            try {
                int fetch= queue.take();
                System.out.println("Fetch: " + fetch);
            }catch (InterruptedException e) {
            }
        }
    }
}
public class ProducerConsumer3 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue= new ArrayBlockingQueue<>(10);
        Thread[] treads= {
                new Producer3(queue),
                new Producer3(queue),
                new Consumer3(queue),
                new Consumer3(queue)
        };
        for (Thread thread: treads)
            thread.start();

        for (Thread thread: treads)
            thread.join();

        System.out.println("Finished: " + queue.size());

    }
}
