package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Executor_CachedThreadPool {
    public static void main(String[] args) throws InterruptedException {

        Executor e = Executors.newCachedThreadPool();
        //Anonymous class
        Runnable runnable = new Runnable(){
            public void run() {
                for (int i = 0; i < 4; i++)
                    System.out.println( Thread.currentThread().getId() + " : " + i );
            }
        };
        for (int i = 0; i < 3; i++)
            e.execute(runnable);

        Thread.sleep(100);
        e.execute(runnable);
    }
}
