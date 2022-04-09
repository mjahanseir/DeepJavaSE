package Thread.ProducerConsumer;
import java.util.*;
import java.util.concurrent.Semaphore;

class Producer2 extends Thread {
    List<Integer> list;
    private Semaphore semaphore;

    public Producer2(List<Integer> list, Semaphore semaphore) {
        this.list = list;
        this.semaphore = semaphore;
    }

    public void run() {
        for (Integer i = 0; i < 100; i++) {
            Integer num = (int) (Math.random() * 1000);
            System.out.println("Added: " + num);
            synchronized (list) {
                list.add(num);
                semaphore.release();
            }
        }
    }
}
class Consumer2 extends Thread {
    List<Integer> list;
    private Semaphore semaphore;
    public Consumer2(List<Integer> list, Semaphore semaphore) {
        this.list = list;
        this.semaphore = semaphore;
    }
    public void run() {
        for (Integer i = 0; i < 100; i++) {
                    try {
                        semaphore.acquire();
                    }catch (InterruptedException e) {
                    }
            synchronized (list) {
                Integer fetch = list.remove(0);
                System.out.println("Fetch: " + fetch);
            }
        }
    }
}
public class ProducerConsumer2 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new LinkedList<>();
        Semaphore semaphore= new Semaphore(0);
        Thread[] treads= {
                new Producer2(list,semaphore),
                new Producer2(list, semaphore),
                new Consumer2(list,semaphore),
                new Consumer2(list, semaphore)
        };
        for (Thread thread: treads)
            thread.start();

        for (Thread thread: treads)
            thread.join();

        System.out.println("Finished: " + list.size());

    }
}
