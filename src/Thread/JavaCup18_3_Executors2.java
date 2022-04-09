package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class JavaCup18_3_Executors2 {
    public static void main(String[] args) throws InterruptedException {

        Executor e = Executors.newSingleThreadExecutor();
        //Anonymous class
        Runnable runnable = new Runnable(){
            public void run() {
                for (int i = 0; i < 4; i++)
                    System.out.println( Thread.currentThread().getId() + " : " + i );
            }
        };
        for (int i = 0; i < 3; i++)
            e.execute(runnable);

//        Thread.sleep(1000);
//        e.execute(runnable);
    }
}
