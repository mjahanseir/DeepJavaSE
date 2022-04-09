package Thread.ProducerConsumer;
import java.util.*;
class Producer extends Thread {
    List<Integer> list;
    public Producer(List<Integer> list) {
        this.list = list;
    }
    public void run() {
        for (Integer i = 0; i < 100; i++) {
            synchronized (list) {
                Integer num = (int) (Math.random() * 1000);
                System.out.println("Added: " + num);
                list.add(num);
                list.notify();
                try {
                    Thread.sleep((long) (Math.random() * 10));
                } catch (InterruptedException e) {
                }
                Integer fetch = list.remove(0);
                System.out.println("Fetch: " + fetch);
            }
        }
    }
}
class Consumer extends Thread {
    List<Integer> list;
    public Consumer(List<Integer> list) {
        this.list = list;
    }
    public void run() {
        for (Integer i = 0; i < 100; i++) {
            synchronized (list) {
                while (list.size() == 0)
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                    }
                Integer fetch = list.remove(0);
                System.out.println("Fetch: " + fetch);
            }
        }
    }
}
public class ProducerConsumer1 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new LinkedList<>();
        Thread[] treads= {
                new Producer(list),
                new Producer(list),
                new Consumer(list),
                new Consumer(list)
        };
        for (Thread thread: treads)
            thread.start();

        for (Thread thread: treads)
            thread.join();

        System.out.println("Finished: " + list.size());

    }
}
