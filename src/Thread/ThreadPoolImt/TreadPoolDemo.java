package Thread.ThreadPoolImt;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(2);

        Runnable processor1= new MessageProcessor(2); //recycle threads
        executor.execute(processor1);

        Runnable processor2= new MessageProcessor(3);
        executor.execute(processor2);

        Runnable processor3= new MessageProcessor(4);
        executor.execute(processor3);

        Runnable processor4= new MessageProcessor(4);
        executor.execute(processor4);

        executor.shutdown(); //Reject any new task from being submitted
        // executor.shutdownNow();// shut down immediately

//        while(!executor.isTerminated()){
//
//        }

        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {}

        System.out.println("submitted all task......");
    }
}