package Thread;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class JavaCup18_4_ThreadLocal {
    public static void main(String[] args) {

        class Task implements Runnable {
            ThreadLocal<Integer> tl = new ThreadLocal<>();

            public void run() {
                tl.set(tl.get() == null ? 1 : tl.get() + 1);
                long thrID = Thread.currentThread().getId();
                System.out.println(thrID + ":" + tl.get());
            }
        }
        //Executor e = Executors.newSingleThreadExecutor();
        Executor e = Executors.newFixedThreadPool(10);

        Task task = new Task();
        for (int i = 0; i < 5; i++)
            e.execute(task);
    }
}
