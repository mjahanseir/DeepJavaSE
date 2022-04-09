package Thread;

import java.util.concurrent.CountDownLatch;
class Job{
    public static void job() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class SendEmail implements Runnable{
    private CountDownLatch latch;
    SendEmail(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("Send Email started");
        Job.job();
        System.err.println("Send Email finished");
    }
}
class VirusCheck implements Runnable{
    private CountDownLatch latch;
    VirusCheck(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {
        System.err.println("Scan started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("Scan finished");
        latch.countDown();
        Job.job();
        System.err.println("Scan finalized");
    }
}

class IndexEmail implements Runnable{
    private CountDownLatch latch;
    IndexEmail(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {
        System.err.println("Index started");
        Job.job();
        System.err.println("Index finished");
        latch.countDown();
        Job.job();
        System.err.println("Index finalized");
    }
}
public class JavaCup18_Concurrency_2_CounDownLatch {
    public static void main(String[] args) {
        CountDownLatch latch= new CountDownLatch(2);
        new Thread(new SendEmail(latch)).start();
        new Thread(new VirusCheck(latch)).start();
        new Thread(new IndexEmail(latch)).start();
    }
}